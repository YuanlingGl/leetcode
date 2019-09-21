package convert_sorted_array_to_binary_search_tree;

/**
 * @program: 20190822——leetcode
 * @description: none
 * @author: dd
 * @created: 2019/09/10 16:07
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length <= 0)
            return null;
        return sortedArrayToBSTCore(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBSTCore(int[] nums,int start ,int end) {
        if(start > end)
            return null;
        int min = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[min]);
        root.left = sortedArrayToBSTCore(nums,start,min-1);
        root.right = sortedArrayToBSTCore(nums,min+1,end);
        return root;
    }
}

