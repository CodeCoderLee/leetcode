package code.coder.lee.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bcc on 16/3/11.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.get(nums[i])==null?1:map.get(nums[i])+1);
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
