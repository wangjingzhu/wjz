package _MyFunctionalInterface;

import java.util.function.Function;

public class Demo_Function {
    public static void main(String[] args) {
        String s ="1234";
        show(s,(String s1)->{
            return Integer.parseInt(s1);
        });
    }

    private static void show(String s, Function<String,Integer> fun) {
        Integer integer = fun.apply(s);
        System.out.println(integer);
    }
}
