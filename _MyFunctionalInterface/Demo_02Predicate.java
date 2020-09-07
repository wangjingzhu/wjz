package _MyFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo_02Predicate {
    public static void main(String[] args) {
        String[] arry = {"王京珠,男","马尔扎哈,男","陈奕迅啊,男","自行车,女"};
        ArrayList<String> list  =  show(arry,(String s)->{
                      return s.split(",")[1].equals("女");
                    },
                     (String s)->{
                     return s.split(",")[0].length()==4;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> show(String[] array,Predicate<String> pre1,Predicate<String> pre2) {
        ArrayList<String> list =new ArrayList<>();
        for (String s : array) {
            boolean b =pre1.and(pre2).test(s);
            if (b){
                list.add(s);
            }
        }
        return list;
    }
}
