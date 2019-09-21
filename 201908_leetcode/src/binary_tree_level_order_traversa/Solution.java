package binary_tree_level_order_traversa;

/**
 * @program: 20190822——leetcode
 * @description: none
 * @author: dd
 * @created: 2019/09/09 21:02
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public void help(TreeNode node,int level){
        if (levels.size()==level)   levels.add(new ArrayList<Integer>());
        levels.get(level).add(node.val);
        if (node.left!=null)    help(node.left,level+1);
        if (node.right!=null)   help(node.right,level+1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return levels;
        help(root,0);
        return levels;
    }
}