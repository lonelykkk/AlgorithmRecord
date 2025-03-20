package leetcode.hot100;

/**
 * 19. 删除链表的倒数第 N 个结点
 *
 * 链接：
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 删除链表的倒数第N个结点 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        curr = head;
        int x = size - n - 1;
        if (x < 0) {
            head = head.next;
            return head;
        }
        while (x > 0) {
            curr = curr.next;
            x--;
        }
        ListNode next = curr.next.next;
        curr.next = next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
