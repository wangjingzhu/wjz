package _MyFunctionalInterface;

import java.util.function.Function;

public class Demo_01Function {
    public static void main(String[] args) {
        String num = "12";
        show(num,
                (s)->{
            return Integer.parseInt(s)+10;
                },
                (Integer s)->{
            return  s+"";
                });
    }

    private static void show(String num,Function<String,Integer> fc1 ,Function<Integer,String> fc2) {
        String s = fc1.andThen(fc2).apply(num);
        System.out.println(s);
    }
}
