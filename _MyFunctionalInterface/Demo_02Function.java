package _MyFunctionalInterface;

import java.util.function.Function;

public class Demo_02Function {
    public static void main(String[] args) {
        String num = "王京珠,18";
       int i = show(num,
                (String s)->{
                   return s.split(",")[1];
                },
                (String s)->{
                    return Integer.parseInt(s);
                },
                (Integer s)->{
                    return s+100;
                });
        System.out.println(i);
    }

    private static Integer show(String num, Function<String,String> fc1 , Function<String,Integer> fc2 , Function<Integer,Integer> fc3) {
        return fc1.andThen(fc2).andThen(fc3).apply(num);
    }
}
