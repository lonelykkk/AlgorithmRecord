package leetcode.hot100.链表;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/10 19:00
 * @Version V1.0
 */
public class 两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode curr = newHead;
        while (curr.next != null && curr.next.next != null) {
            ListNode node1 = curr.next;
            ListNode node2 = curr.next.next;
            curr.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            curr = node1;
        }
        return newHead.next;
    }


     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
