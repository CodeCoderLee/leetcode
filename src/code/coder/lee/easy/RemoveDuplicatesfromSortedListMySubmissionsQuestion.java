package code.coder.lee.easy;

import code.coder.lee.common.ListNode;
import sun.org.mozilla.javascript.internal.ast.IfStatement;

/**
 * Created by bcc on 16/3/23.
 */
public class RemoveDuplicatesfromSortedListMySubmissionsQuestion {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return temp;
    }
}
