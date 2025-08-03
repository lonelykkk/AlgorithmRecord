package hot100.链表;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/8/3 10:54
 * @Version V1.0
 */
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
