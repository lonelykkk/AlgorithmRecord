package leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. 随机链表的复制
 *
 * 链接：
 * https://leetcode.cn/problems/copy-list-with-random-pointer/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 随机链表的复制 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            Node clone = map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
