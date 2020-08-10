package lianxi4;
//键盘输入一个字符串，并且统计其中各种字符出现得次数。
//字符种类： 大写字符，小写字符，数字，其他字符
import java.util.Scanner;

public class Demo_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next(); //获取键盘输入得字符串

        int countUpper = 0; //大写
        int countLower = 0; //小写
        int countNumer = 0; //数字
        int  countOther = 0; //其他字符
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];  //当前单个字符
            if ('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if ('a'<= ch && ch <= 'z'){
                countLower++;
            }else if ('0'<= ch && ch <= '9'){
                countNumer++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有： " + countUpper);
        System.out.println("小写字母有： " + countLower);
        System.out.println("数字有： " + countNumer);
        System.out.println("其他字符有： " + countOther);

    }
}
