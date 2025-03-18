package leetcode.hot100;

/**
 * 141. 环形链表
 *
 * 链接：
 * https://leetcode.cn/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        int res = (int) (1e5 + 10);
        while (curr != null) {
            if (curr.val == res) {
                return true;
            }
            curr.val = res;
            curr = curr.next;
        }
        return false;
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
