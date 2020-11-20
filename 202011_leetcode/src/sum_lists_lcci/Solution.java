package sum_lists_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/20
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //思路 四条链表 新建一条进位一条结果
        //新思路 三条链表 新建一条进位 一个进位标识
        //进位标识
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int num = num1 + num2 + carry;
            carry = num / 10;
            cur.next = new ListNode(num % 10);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            cur = cur.next;
        }
        if (carry == 1){
            cur.next = new ListNode(carry);
        }
        return ans.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}