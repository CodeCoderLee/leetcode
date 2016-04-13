package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/28.
 */
public class HouseRobber_hard {
    public int rob(int[] nums) {
        int stealMax = 0;
        int noStealMax = 0;
        for (int i=0;i<nums.length;i++){
            int temp = stealMax;
            if (nums[i]+noStealMax>stealMax){
                stealMax = nums[i] + noStealMax;
            }
            noStealMax = temp>noStealMax?temp:noStealMax;
        }
        return stealMax>noStealMax?stealMax:noStealMax;
    }
}
