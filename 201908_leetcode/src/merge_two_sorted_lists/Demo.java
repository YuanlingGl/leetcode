package merge_two_sorted_lists;

public class Demo {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.next.val=2;
        l1.next.next.val=4;
        l2.next.val=3;
        l2.next.next.val=4;

        Solution s = new Solution();
        s.mergeTwoLists(l1,l2);
    }
}
