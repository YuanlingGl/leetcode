package merge_two_sorted_lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}

/*class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode re = null;

        if (l1.val>l2.val){
           re=l2;
        }else if(l1.val<l2.val){
            re=l1;
        }

        while(l1.next!=null&&l2.next!=null){




            if (l1.next.val > l2.next.val){
                re.next=l2;
                l2=l2.next;
            }else if(l1.next.val<l2.next.val){
                re.next=l1;
                l1=l1.next;
            }else if (l1.next.val==l2.next.val){
                re.next=l1;
                re.next.next=l2;
                l1=l1.next;
                l2=l2.next;
            }


        }
        if (l1.next==null){
            while(l2.next!=null){
                re.next=l2.next;
                l2=l2.next;
            }
        }
        else if (l2.next==null){
            while(l1.next!=null){
                re.next=l1.next;
                l1=l1.next;
            }
        }



        return re;
    }
}


 */
