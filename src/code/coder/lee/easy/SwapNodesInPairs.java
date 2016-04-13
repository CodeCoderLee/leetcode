package code.coder.lee.easy;

import code.coder.lee.common.ListNode;

/**
 * Created by bcc on 16/3/28.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode h = new ListNode(0);
        ListNode h1 = h;
        h.next = head;
        while (head != null && head.next != null) {
            ListNode temp = head.next.next;
            head.next.next = null;
            h1.next = head.next;
            h1.next.next = head;
            head.next = null;
            h1 = head;
            head = temp;
        }
        h1.next = head;/*这句话必须要加上*/
        return h.next;
    }
}
