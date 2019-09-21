package reverse_linked_list;

import java.util.List;

/**
 * Definition for singly-linked list.
 *
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode p =reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
        /*ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

         */



