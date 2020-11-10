package reverse_linked_list;

import java.util.List;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/10
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }
    public ListNode reverse(ListNode a1,ListNode a2){
        if (a2==null){
            return a1;
        }
        ListNode next = a2.next;
        a2.next=a1;
        return reverse(a2,next);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}