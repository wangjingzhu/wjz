package lianxi1;

import java.util.Arrays;
import java.util.Scanner;

public class lianxi1 {
    /*public static int sum(int n) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }*/
    public static int[] func(int[] arra1) {
        int[] tmp = new int[arra1.length];
        for (int i = 0; i < arra1.length; i++) {
            tmp[i] = arra1[i] * 2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
    }
}

