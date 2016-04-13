package code.coder.lee.easy;

import code.coder.lee.common.ListNode;

/**
 * Created by bcc on 16/3/11.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode(0);
        if(head==null||head.next==null){
            return head;
        }
        temp.next = head;
        head = head.next;
        temp.next.next = null;
        while (head!=null){
            ListNode listNode = head.next;
            head.next = temp.next;
            temp.next = head;
            head = listNode;
        }
        return temp.next;
    }
    public static void main(String[] args) {

    }
}
