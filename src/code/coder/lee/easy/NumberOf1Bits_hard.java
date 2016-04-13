package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/13.
 */
public class NumberOf1Bits_hard {
    public int hammingWeight(int n) {
        int count = 0;
//        while(n!=0&&n!=1){
//            count += n%2;
//            int temp = n&1;
//            n = n>>>1;
//        }
        /**
         * 注意n%2和n&1的区别..当n&1返回的是无符号数,而n%2,则带符号...若n=0xFFFFFFFF时,n%2 = -1,n&1 = 1
         */
        while (n!=0){
            count += n&1;
            n = n>>>1;
        }
        return n + count;
    }
    public static void main(String[] args) {
        System.out.println(new NumberOf1Bits_hard().hammingWeight(0xFFFFFFFF));
    }
}
