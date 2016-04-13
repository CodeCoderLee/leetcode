package code.coder.lee.easy;

import code.coder.lee.common.GenerateTreeTool;
import code.coder.lee.common.TreeNode;

import java.util.*;

/**
 * Created by bcc on 16/3/28.
 */
public class SymmetricTree_hard {
    /**
     * 中序遍历不行!!!!!
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 2};
        TreeNode root = GenerateTreeTool.generateTree(nums);
        SymmetricTree_hard symmetricTree_hard = new SymmetricTree_hard();
        System.out.println(symmetricTree_hard.isSymmetric(root));
    }
}
