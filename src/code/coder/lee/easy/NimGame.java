package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/7.
 */
public class NimGame {
    public boolean canWinNim(int n) {
        /*只要当前数字不是4的倍数,那么只需要每次拿x个,保证使剩下的数字为4的倍数,那么对方一定输*/
        if(n%4==0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {

    }
}
