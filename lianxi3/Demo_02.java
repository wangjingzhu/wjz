package lianxi3;
/*
* 生成1~33之间随机整数，添加到集合，并遍历集合*/
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Demo_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random num = new Random();
        for (int i = 0; i <6 ; i++) {
            int l1 = num.nextInt(33) + 1;
            list.add(l1);
        }
        for (int i = 0; i < list.size(); i++) {
            Integer num1 = list.get(i);
            System.out.println(num1);
        }
    }
}
