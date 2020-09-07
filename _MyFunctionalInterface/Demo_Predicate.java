package _MyFunctionalInterface;

import java.util.function.Predicate;

public class Demo_Predicate {
    public static void main(String[] args) {
        boolean value = show("asjdqw",(s)->s.length()>5);
        System.out.println(value);
    }

    private static boolean show(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
