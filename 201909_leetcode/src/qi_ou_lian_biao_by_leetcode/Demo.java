package qi_ou_lian_biao_by_leetcode;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/27 19:36
 */
//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


public class Demo {
}
      class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null) return null;
            ListNode odd = head, even = head.next, evenHead = even;
            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
    }

