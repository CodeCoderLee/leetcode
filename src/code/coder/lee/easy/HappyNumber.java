package code.coder.lee.easy;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by bcc on 16/3/23.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (n != 1){
            int temp = n;
            int count = 0;
            while (temp != 0){
                int mod = temp % 10;
                count += mod * mod;
                temp = temp/10;
            }
            n = count;
            if (set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(64));

    }
}
