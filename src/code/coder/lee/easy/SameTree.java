package code.coder.lee.easy;

import code.coder.lee.common.TreeNode;

/**
 * Created by bcc on 16/3/10.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if ((p != null && q == null) || (p == null)) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {

    }
}
