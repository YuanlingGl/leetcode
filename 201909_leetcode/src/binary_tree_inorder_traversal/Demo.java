package binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/29 19:20
 */
public class Demo {
}


/**
 * Definition for a binary tree node.
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rel = new ArrayList<>();
        helper(root,rel);
        return rel;
    }
    public void helper(TreeNode root, List<Integer> rel){
        if (root!=null){
            if (root.left!=null){
                helper(root.left,rel);
            }
            rel.add(root.val);
            if (root.right!=null){
                helper(root.right,rel);
            }
        }

    }
}