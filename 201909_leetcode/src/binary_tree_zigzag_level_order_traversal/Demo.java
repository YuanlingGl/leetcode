package binary_tree_zigzag_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/30 19:10
 */
public class Demo {
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;

    }

    private void helper(List<List<Integer>> res, TreeNode root, int depth) {
        if (root == null) return;
        if (res.size() == depth) res.add(new LinkedList<>());
        if (depth % 2 == 0) res.get(depth).add(root.val);
        else res.get(depth).add(0, root.val);
        helper(res, root.left, depth + 1);
        helper(res, root.right, depth + 1);
    }
}
