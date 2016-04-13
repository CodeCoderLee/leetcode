package code.coder.lee.easy;

import code.coder.lee.common.TreeNode;

/**
 * Created by bcc on 16/3/13.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = p.val > q.val ? p.val : q.val;
        int min = p.val < q.val ? p.val : q.val;
        if(root==null||(root.val==p.val)||(root.val==q.val)||(root.val>min&&root.val<max)){
            return root;
        }
        if (root.val<min){
            return lowestCommonAncestor(root.right, p, q);
        }else {
            return lowestCommonAncestor(root.left, p, q);
        }
    }
    public static void main(String[] args) {

    }

}
