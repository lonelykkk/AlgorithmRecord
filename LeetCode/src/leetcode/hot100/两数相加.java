package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. 两数相加
 *
 * 链接：
 * https://leetcode.cn/problems/add-two-numbers/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode init = head;
        int k = 0;
        while (l1 != null && l2 != null) {

            int a = l1.val + l2.val + k;
            if (a >= 10) {
                k = 1;
            } else {
                k = 0;
            }
            ListNode curr = new ListNode(a % 10, null);
            head.next = curr;
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int a = l1.val + k;
            if (a >= 10) {
                k = 1;
            } else {
                k = 0;
            }
            ListNode curr = new ListNode(a % 10, null);
            head.next = curr;
            head = head.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int a = l2.val + k;
            if (a >= 10) {
                k = 1;
            } else {
                k = 0;
            }
            ListNode curr = new ListNode(a % 10, null);
            head.next = curr;
            head = head.next;
            l2 = l2.next;
        }
        if (k == 1) {
            ListNode curr = new ListNode(1, null);
            head.next = curr;
        }
        return init.next;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
