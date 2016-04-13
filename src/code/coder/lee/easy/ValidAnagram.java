package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/10.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s==null&&t==null){
            return true;
        }else if(s==null){
            return false;
        }else if(t==null){
            return false;
        }else{
            if(s.length()!=t.length()){
                return false;
            }
            int i=0;
            int[] nums = new int[26];
            while(i<s.length()&&i<t.length()){
                nums[s.charAt(i)-'a']++;
                nums[t.charAt(i)-'a']--;
                i++;
            }
            for(int j=0;j<nums.length;j++){
                if (nums[j]!=0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("", ""));
    }
}
