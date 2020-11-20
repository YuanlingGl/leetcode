package partition_list_lcci;

import java.util.List;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/20
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode leftHead = new ListNode(-1);
        ListNode left = leftHead;
        ListNode rightHead = new ListNode(-1);
        ListNode right = rightHead;
        ListNode next;
        while (head != null) {
            next = head.next;
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head.next = null;
            head = next;
        }
        left.next = rightHead.next;
        return leftHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}