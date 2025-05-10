package leetcode.hot100.链表;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/10 21:30
 * @Version V1.0
 */
public class 合并K个排序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        return solve(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    public ListNode solve(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return (a == null) ? b : a;
        }
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (a != null && b != null) {
            if (a.val < b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        curr.next = (a == null) ? b : a;
        return head.next;
    }
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
