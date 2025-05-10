package leetcode.hot100.链表;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/10 20:11
 * @Version V1.0
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
            Node node1 = map.get(curr);
            node1.next = map.get(curr.next);
            node1.random = map.get(curr.random);
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
