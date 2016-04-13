package code.coder.lee.easy;

import code.coder.lee.common.TreeNode;

/**
 * Created by bcc on 16/3/28.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        if (Math.abs(depthOfTree(root.left)-depthOfTree(root.right))>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depthOfTree(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(depthOfTree(root.left), depthOfTree(root.right))+1;
    }
}
