package merge_sorted_array;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/04 21:05
 */
public class Demo {
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p =m+n-1;
        while((p1>=0)&&(p2>=0)){
            nums1[p--] = (nums1[p1]<nums2[p2]?nums2[p2--]:nums1[p1--]);
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
    }
}