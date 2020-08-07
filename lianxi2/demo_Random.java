package lianxi2;

import java.util.Random;

public class demo_Random {
    public static void main(String[] args) {
        int n =10;
        Random random = new Random();
        for (int i = 1; i < 100; i++) {
            int num = random.nextInt(n) + 1;   /*之前是【0，9），现在是【1，10】之间得随机值*/
            System.out.println(num);
        }
    }
}
