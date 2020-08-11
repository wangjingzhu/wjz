package lianxi5;

import java.util.Arrays;

public class Demo_02 {
    public static void main(String[] args) {
        int[] num = {10,11,12};
        String s = Arrays.toString(num);
        System.out.println(s);

        String[] str = {"vvv","aaa","zzz"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
