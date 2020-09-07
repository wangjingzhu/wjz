package _MyFunctionalInterface;

import java.util.function.Predicate;

public class Demo_01Predicate {
    public static void main(String[] args) {
        boolean value = show("asjdqw",
                (s)->s.length()>5,
                (s)->s.contains("a"));
        System.out.println(value);
    }

    private static boolean show(String s, Predicate<String> pre,Predicate<String> pre1) {

//        return pre.test(s) &&pre1.test(s);
        return pre.and(pre1).test(s);
        //和and（&&），或or（||），取反negate(!)
    }
}
