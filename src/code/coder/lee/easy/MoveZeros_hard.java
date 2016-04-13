package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/9.
 */
public class MoveZeros_hard {
    public void moveZeroes(int[] nums) {
        if (nums==null){
            return;
        }
        for(int i=nums.length-1;i>=0;i--){
            while(i>=0&&nums[i]!=0){
                i--;
            }
            if(i>=0&&nums[i]==0){
                for(int j=i ;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = 0;
            }


        }
    }

    public void moveZeroes1(int[] nums){
        if(nums == null){
            return;
        }
        int zeroNum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroNum++;
            }else{
                nums[i-zeroNum] = nums[i];
            }
        }
        while(zeroNum>0){
            nums[nums.length-zeroNum] = 0;
            zeroNum--;
        }
    }

    public static void main(String[] args) {
        MoveZeros_hard moveZeros = new MoveZeros_hard();
        int[] nums = {1,0,0};
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+ "  ");
        }
        System.out.println();
        moveZeros.moveZeroes1(nums);
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+ "  ");
        }
    }
}
