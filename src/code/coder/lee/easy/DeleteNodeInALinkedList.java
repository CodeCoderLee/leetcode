package code.coder.lee.easy;

import code.coder.lee.common.ListNode;

/**
 * Created by bcc on 16/4/6.
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null)
                node.next = null;
            else
                node = node.next;
        }
    }
}
