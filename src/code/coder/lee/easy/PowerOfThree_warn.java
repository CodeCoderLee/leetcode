package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/23.
 */
public class PowerOfThree_warn {
    private static final double epsilon = 10e-15;

    public boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;
        if (n == 1) {
            return true;
        }
        while (n != 1) {
            if (n % 3 != 0)
                return false;
            n /= 3;
        }
        return true;
    }

    public boolean isPowerOfThree1(int n) {

        if (n==0)
            return false;

        /**
         * 由于java浮点数精度的问题..下面的代码会导致n=243时出错.
         */
//        return Double.valueOf(Math.log(n)/Math.log(3)).intValue() ==  Math.log(n)/Math.log(3);
//        return Math.floor(res) == Math.ceil(res);
        double res = Math.log(n)/Math.log(3);
        /*只需要判断res是否为整数*/
        return Math.abs(res - Math.round(res)) < epsilon;
    }

    public static void main(String[] args) {
        PowerOfThree_warn powerOfThreeWarn = new PowerOfThree_warn();
        System.out.println(powerOfThreeWarn.isPowerOfThree1(81*4));
    }
}
