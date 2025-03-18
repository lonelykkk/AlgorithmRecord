package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 *
 * 链接：
 * https://leetcode.cn/problems/palindrome-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 回文链表 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = nums.size()-1;
        while (l < r) {
            if (!nums.get(l).equals(nums.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
