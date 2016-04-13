package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/23.
 */
public class UglyNumber_warn {
    public boolean isUgly(int num) {
        /**
         * 注意num == 0 的情况
         */
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        UglyNumber_warn uglyNumber = new UglyNumber_warn();
        System.out.println(uglyNumber.isUgly(14));
    }
}
