package lianxi3;

import java.util.ArrayList;
import java.util.Random;

/*用一个大集合存入20个随机数字，然后筛选其中得偶数元素，放到小集合当中。*/
public class Demo_05 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 19 ; i++) {
            int num = random.nextInt(100) + 1; /*1~100*/
            list1.add(num);
        }
        System.out.println(list1);
        ArrayList<Integer> num1 = getSamllList(list1);
        System.out.println("偶数总共有：" + num1.size());
        System.out.println(num1);
    }
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> list1){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer num = list1.get(i);
            if (num % 2 == 0){
                list2.add(num);
            }
        }
        return list2;
    }
}
