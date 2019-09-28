package intersection_of_two_linked_lists;

import java.util.Map;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/28 21:27
 */
public class Demo {
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha = headA, hb = headB;
        while (ha != hb) {
            ha = ha != null ? ha.next : headB;
            hb = hb != null ? hb.next : headA;
        }
        return ha;
    }
}
