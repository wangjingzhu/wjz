package lianxi5;

import java.util.Arrays;

//利用Arrays相关的API，将一个随机的字符串中的所有字符升序排列，并倒序打印

public class Demo_03 {
    public static void main(String[] args) {
        String src = "vhuiow89qwc";
        char[] num = src.toCharArray();
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);            //倒序打印
        }
        System.out.println("=================================");
        for (int i = 0; i < num.length; i++) {    //升序打印
            System.out.println(num[i]);
        }
    }
}
