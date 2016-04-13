package code.coder.lee.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bcc on 16/3/12.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int num = 0;
        for (int i=0;i<s.length();i++){
            num += map.get(s.charAt(i));
            if(i<s.length()-1&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                num = num - map.get(s.charAt(i)) * 2;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMLXXX"));

    }
}
