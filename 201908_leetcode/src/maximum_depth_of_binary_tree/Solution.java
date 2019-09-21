package maximum_depth_of_binary_tree;

import static java.lang.Math.max;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int max_Depth_l = maxDepth(root.left);
        int max_Depth_r = maxDepth(root.right);
        return java.lang.Math.max(max_Depth_l,max_Depth_r)+1;
    }
}