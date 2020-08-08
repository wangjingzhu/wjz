package lianxi3;

import java.util.ArrayList;

public class Demo_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);  //[]

        boolean success = list.add("wjz");
        System.out.println(list);
        System.out.println("添加动作是否成功"+success);

        list.add("yjz");
        list.add("wjke");
        list.add("wjj");
        System.out.println(list);

        String name = list.get(0);
        System.out.println("第一号索引值:"+name);

        String remove = list.remove(2);
        System.out.println("删除第三号"+remove);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        ArrayList<Integer>inte1 = new ArrayList<>();
        inte1.add(12);
        inte1.add(15);
        System.out.println(inte1);
        int num1 = inte1.get(0);
        System.out.println(num1);


    }
}
