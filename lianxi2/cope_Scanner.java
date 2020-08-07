package lianxi2;

import java.util.Scanner;

public class cope_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num>num1?num:num1;
        int num4 = num3>num2?num3:num2;
        System.out.println(num4);

    }
}
