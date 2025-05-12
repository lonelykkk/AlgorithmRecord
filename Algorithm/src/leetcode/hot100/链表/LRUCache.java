package leetcode.hot100.链表;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    class DLinkedNode {
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode(int key,int val) {
            this.key = key;
            this.val = val;
        }

        public DLinkedNode() {

        }
    }

    int capacity;
    int size;
    DLinkedNode head;
    DLinkedNode tail;
    Map<Integer, DLinkedNode> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            size++;
            node = new DLinkedNode(key, value);
            cache.put(key, node);
            addToHead(node);
            if (size > capacity) {
                DLinkedNode tt = removeTail();
                cache.remove(tt.key);
                size--;
            }
        } else {
            node.val = value;
            moveToHead(node);
        }
    }

    // 移动到头结点
    public void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    // 删除结点
    public void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // 删除尾结点
    public DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    // 将结点移动到头部
    public void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }
}