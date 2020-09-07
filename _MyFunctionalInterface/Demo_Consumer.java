package _MyFunctionalInterface;

import java.util.function.Consumer;

public class Demo_Consumer {
    private static void show(String name, Consumer<String> c1, Consumer<String> c2) {
//        c1.accept(name);
//        c2.accept(name);
        c1.andThen(c2).accept(name);
    }

    public static void main(String[] args) {
        show("Hello",
                (t)->{
                    System.out.println(t.toUpperCase());
                },
                (t)->{
                    System.out.println(t.toLowerCase());
                });
    }
}
