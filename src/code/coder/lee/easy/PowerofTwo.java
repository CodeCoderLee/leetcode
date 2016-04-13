package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/24.
 */
public class PowerofTwo {
    private final static double epsilon = 10e-15;

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public boolean isPowerOfTwo1(int n) {
        if (n == 0) {
            return false;
        }
        double result = Math.log(n)/Math.log(2);
        return Math.abs(result - Math.round(result)) < epsilon;
    }

    public static void main(String[] args) {
        PowerofTwo powerofTwo = new PowerofTwo();
        System.out.println(powerofTwo.isPowerOfTwo1(2));
    }

}
