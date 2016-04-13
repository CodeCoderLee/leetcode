package code.coder.lee.easy;

import code.coder.lee.common.TreeNode;

/**
 * Created by bcc on 16/3/8.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
        /*
        * 若是使用return maxDepth(root.left)>maxDepth(root.right)?maxDepth(root.left)+1:maxDepth(root.right)+1
        * 表达式,会造成超时.
        * */
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        maximumDepthOfBinaryTree.maxDepth(treeNode);
    }
}
