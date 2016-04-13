package code.coder.lee.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bcc on 16/3/10.
 */
public class ContainsDuplicate_hard {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if (map.get(nums[i])!=null){
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
