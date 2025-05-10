package leetcode.hot100.链表;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/10 19:36
 * @Version V1.0
 */
public class K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode pre = hair;
        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode nex = tail.next;
            ListNode[] listNodes = solve(head, tail);
            ListNode node1 = listNodes[0];
            ListNode node2 = listNodes[1];
            pre.next = node1;
            node2.next = nex;

            pre = node2;
            head = nex;
        }
        return hair.next;
    }

    public ListNode[] solve(ListNode head, ListNode tail) {
        ListNode pre = tail.next;
        ListNode p = head;
        while (pre != tail) {
            ListNode next = p.next;
            p.next = pre;
            pre = p;
            p = next;
        }
        return new ListNode[]{tail, head};
    }



     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
