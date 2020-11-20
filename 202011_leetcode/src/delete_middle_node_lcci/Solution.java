package delete_middle_node_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/20
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}