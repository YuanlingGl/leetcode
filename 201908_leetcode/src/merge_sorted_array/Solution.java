package merge_sorted_array;

/**
 * @program: 20190822——leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/10 20:39
 */
class Demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        s.merge(nums1,m,nums2,n);

        for (int i:
             nums1) {
            System.out.print(i );
        }
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] nums3 = new int[m+n];
        while((i+j)<n+m) {
            //System.out.println(nums1[i] + " " + nums2[j]);
            if (i<m && j<n) {
                if (nums1[i] < nums2[j]) {
                    nums3[k] = nums1[i];
                    i++;
                    k++;
                    //System.out.println(1);
                } else if (nums1[i] > nums2[j]) {
                    nums3[k] = nums2[j];
                    j++;
                    k++;
                    //System.out.println(2);
                } else {
                    nums3[k] = nums1[i];
                    i++;
                    k++;
                    nums3[k] = nums2[j];
                    j++;
                    k++;
                    //System.out.println(3);
                }
            }else if(i==m){
                nums3[k]=nums2[j];
                k++;
                j++;
            }else if(j==n){
                k++;
                i++;
            }
        }
        for (int z = 0;z<nums3.length;z++){
            nums1[z]=nums3[z];
        }
    }
}