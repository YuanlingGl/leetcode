package kth_node_from_end_of_list_lcci;


import java.util.Stack;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/19
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            fast = fast.next;
            k -= 1;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public int kthToLast1(ListNode head, int k) {
        Stack<ListNode> stack = new Stack();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        for (int i = 1; i < k; i++) {
            stack.pop();
        }
        return stack.peek().val;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}