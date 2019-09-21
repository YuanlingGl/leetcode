package symmetric_tree;

/**
 * @program: 20190822——leetcode
 * @description: none
 * @author: dd
 * @created: 2019/09/07 21:19
 */

//import javax.swing.tree.TreeNode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1==null&&t2==null) return true;
        if (t1==null||t2==null) return false;

        return t1.val==t2.val&&isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }
}
class Solution{
    public boolean isSymmetric(TreeNode root){
        Queue<TreeNode> t = new LinkedList<>();
        t.add(root);
        t.add(root);
        while(!t.isEmpty()){
            TreeNode t1 = t.poll();
            TreeNode t2 = t.poll();
            if (t1==null&&t2==null){
                continue;
            }
            if (t1==null||t2==null){
                return false;
            }
            if (t1.val!=t2.val){
                return false;
            }
            t.add(t1.right);
            t.add(t2.left);
            t.add(t1.left);
            t.add(t2.right);
        }

        return true;
    }
}