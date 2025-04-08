package leetcode.hot100;

/**
 * 24. 两两交换链表中的节点
 *
 * 链接：
 * https://leetcode.cn/problems/swap-nodes-in-pairs/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;
        curr.next = head;
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
