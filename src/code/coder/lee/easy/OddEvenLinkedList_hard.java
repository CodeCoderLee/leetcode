package code.coder.lee.easy;

import code.coder.lee.common.ListNode;

/**
 * Created by bcc on 16/3/16.
 */
public class OddEvenLinkedList_hard {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddNode = new ListNode(0);
        ListNode evenNode = new ListNode(0);
        ListNode oddCurr = oddNode;
        ListNode evenCurr = evenNode;
        int count = 0;
        while (head != null) {
            count++;
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            if (count % 2 == 0) {
                evenCurr.next = temp;
                evenCurr = evenCurr.next;
            } else {
                oddCurr.next = temp;
                oddCurr = oddCurr.next;
            }
        }
        oddCurr.next = evenNode.next;
        return oddNode.next;
    }

    /**
     * 默认头结点第一个是奇数,第二个是偶数,第三个是奇数....,其实是不按照value来判断,而是按照node顺序的number号.
     *
     * @param head 头结点
     * @return
     */
    public ListNode oddEvenList1(ListNode head) {

        return null;
    }

    public static void main(String[] args) {

    }
}
