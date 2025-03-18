package leetcode.hot100;

/**
 * 141. 环形链表
 *
 * 链接：
 * https://leetcode.cn/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 环形链表II {
    public ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        int res = (int) (2e5 + 10);
        while (curr != null) {
            if (curr.val >= res) {
                curr.val -= res;
                return curr;
            }
            curr.val += res;
            curr = curr.next;
        }
        return null;
    }

      class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
  }
}
