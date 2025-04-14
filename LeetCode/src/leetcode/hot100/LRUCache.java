package leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU 缓存
 *
 * 链接：
 * https://leetcode.cn/problems/lru-cache/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class LRUCache {
    // 双向链表
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        DLinkedNode() {

        }

        DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Map<Integer, DLinkedNode> map = new HashMap<>();
    int size;
    int capacity;
    private DLinkedNode head, tail;
    public LRUCache(int capacity) {
        size = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        // 存在的话将该元素放入链表头部
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        // 获取当前key是否存在
        DLinkedNode node = map.get(key);
        if (node == null) {
            // 如果不存在，添加到链表头部
            DLinkedNode newNode = new DLinkedNode(key, value);
            map.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                // 如果超出最大容量，移除链表尾部
                DLinkedNode tail = removeTail();
                map.remove(tail.key);
                size--;
            }
        } else {
            // 如果存在，则更新
            node.value = value;
            moveToHead(node);
        }
    }

    public void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    public void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }
}
