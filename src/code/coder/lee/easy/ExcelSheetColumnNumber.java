package code.coder.lee.easy;

/**
 * Created by bcc on 16/3/10.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if (s == null) {
            return 0;
        }
        int num = 0;
        int i = 0;
        while (i < s.length()) {
            num = num * 26 + s.charAt(i) - 'A' + 1;
            i++;
        }
        return num;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("AAA"));
    }
}
