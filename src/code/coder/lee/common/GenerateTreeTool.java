package code.coder.lee.common;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by bcc on 16/3/28.
 */
public class GenerateTreeTool {
    public static TreeNode generateTree(Integer[] nums){
        if (nums.length==0){
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i=1;
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (i<nums.length){
                if (nums[i]!=null){
                    TreeNode left = new TreeNode(nums[i]);
                    temp.left = left;
                    queue.add(left);
                }
            }else {
                break;
            }
            i++;
            if(i<nums.length){
                if (nums[i]!=null){
                    TreeNode right = new TreeNode(nums[i]);
                    temp.right = right;
                    queue.add(right);
                }
            }else
                break;
            i++;
        }
        return root;
    }
}
