package leetcode.hot100;

/**
 * 25. K 个一组翻转链表
 *
 * 链接：
 * https://leetcode.cn/problems/reverse-nodes-in-k-group/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode p = head;
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
            ListNode[] listNodes = myReverse(head, tail);
            head = listNodes[0];
            tail = listNodes[1];

            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }
        return hair.next;
    }

    public ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode pre = tail.next;
        ListNode p = head;
        while (p != pre) {
            ListNode nex = p.next;
            p.next = pre;
            pre = p;
            p = nex;
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
