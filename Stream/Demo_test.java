package Stream;

import lambda.Penson;

import java.util.ArrayList;

public class Demo_test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("阿达的");
        list.add("王啊");
        list.add("王静竹");
        list.add("阿瑟东");
        list.add("史蒂夫");
        list.add("张三的");
        list.add("法国");
        ArrayList<String> list1 = new ArrayList<>();
        for(String one:list){
            if (one.length()==3){
                list1.add(one);
            }
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            list2.add(list1.get(i));
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (String s:list){
            if (s.startsWith("王")){
                list3.add(s);
            }
        }
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 2; i <list3.size() ; i++) {
            list4.add(list3.get(i));
        }
        ArrayList<String> list5 = new ArrayList<>();
        list5.addAll(list2);
        list5.addAll(list4);
        ArrayList<Person> list6 = new ArrayList<>();
        for (String a:list5){
            list6.add(new Person(a));
        }

        System.out.println(list6);
        for (Person p: list6){
            System.out.println(p);
        }

    }
}
