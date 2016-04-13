package code.coder.lee.easy;

import code.coder.lee.common.TreeNode;

import java.util.*;

/**
 * Created by bcc on 16/4/6.
 */
public class BinaryTreeLevelOrderTraversal_II_hard {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        levelOrder(stack, queue);
        List<List<Integer>> lists = new ArrayList<>();
        while (!stack.isEmpty()) {
            lists.add(stack.pop());
        }
        return lists;
    }

    public void levelOrder(Stack<List<Integer>> stack, Queue<TreeNode> queue){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> childQueue = new LinkedList<>();
        /**
         * 注意要先判断是否为空,否则会造成一直递归
         */
        if(queue.isEmpty()){
            return;
        }
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                childQueue.add(node.left);
            }
            if (node.right != null) {
                childQueue.add(node.right);
            }

        }
        stack.push(list);
        levelOrder(stack, childQueue);
    }
}
