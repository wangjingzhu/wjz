package _MyFunctionalInterface;

import java.util.function.Supplier;

public class Demo_Suppier {
    public static void main(String[] args) {
        System.out.println(getString(()->"大哥"));
    }

    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }
}
