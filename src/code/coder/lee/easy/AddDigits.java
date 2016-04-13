package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/7.
 */
public class AddDigits {
    public int addDigits(int num){
        int sum;
        while(num>=10){
            sum = 0;
            while(num/10>0){/*循环除10,并相加*/
                sum += num%10;
                num /=10;
            }
            sum += num;
            num = sum;/*相加结果付给num,若num>=10,继续while循环*/
        }
        return num;
    }

    public int addDigits1(int num){
        int sum = 0;
        while(num>=10){
            /*两个小于10的数字相加,其结果一定<=18,那么最终的相加结果一定小于9,只需两数相加结果是否>=10,若大于在各位数上加1即可*/
            sum = (sum + num%10)>=10?(sum + num%10)%10+1:(sum + num%10);
            num /= 10;
        }
        return (sum + num%10)>=10?(sum + num%10)%10+1:(sum + num%10);
    }

    public int addDigits2(int num){
        while(num>=10){
            num = num/10 + num%10;
        }
        return num;
    }

    /**
     * O(1)时间复杂度,找规律 input = 0,1,2,3,4,5,6,7,8,9,10,11,12,13...
     *                    output = 0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9......
     *             那么 d(n) = num%9==0?(num==0? 0 : 9) : num%9或者 d(n) = 1 + (num-1)%9;
     * @param num
     * @return
     */
    public int addDigits3(int num){
        //注意可能存在0的情况.
        return num%9==0?(num/9==0?0:9):num%9;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits2(1384));
    }


}
