package hot100.链表;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/8/3 11:01
 * @Version V1.0
 */
public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int index = size - n - 1;
        if (index < 0) {
            head = head.next;
            return head;
        }
        curr = head;
        while (index > 0) {
            curr = curr.next;
            index--;
        }
        ListNode next = curr.next.next;
        curr.next = next;
        return head;
    }
}
