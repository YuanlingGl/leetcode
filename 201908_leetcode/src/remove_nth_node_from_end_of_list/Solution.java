package remove_nth_node_from_end_of_list;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while(first!=null){
            length++;
            first = first.next;
        }
        length -=n;
        first = dummy;
        while ((length>0)){
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
/*
第一次遍历，获得链表长度
跳过要删除的节点
第二次遍历，复原刚刚打乱的指针
 */
