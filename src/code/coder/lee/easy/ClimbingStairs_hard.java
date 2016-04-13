package code.coder.lee.easy;

import java.util.Date;

/**
 * Created by bcc on 16/3/23.
 */
public class ClimbingStairs_hard {
    /**
     * 此种方法超时!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     *
     * @param n 台阶数
     * @return 爬台阶方法数
     */
    public int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    public int climbStairs1(int n) {
        int[] num = {0,1};
        int i = 1;
        int count = 0;
        while(i<=n){
            count = num[0] + num[1];
            num[0] = num[1];
            num[1] = count;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        ClimbingStairs_hard climbingStairs = new ClimbingStairs_hard();
        Date date = new Date();
        System.out.println(climbingStairs.climbStairs(44));
        System.out.println(new Date().getTime() - date.getTime());
        date = new Date();
        System.out.println(climbingStairs.climbStairs1(44));
        System.out.println(new Date().getTime() - date.getTime());
    }
}
