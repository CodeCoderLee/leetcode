package code.coder.lee.easy;

import code.coder.lee.common.TreeNode;

/**
 * Created by bcc on 16/3/9.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
        }
        return root;
    }
}
