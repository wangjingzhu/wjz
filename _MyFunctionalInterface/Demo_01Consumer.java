package _MyFunctionalInterface;


import java.util.function.Consumer;

public class Demo_01Consumer {
    public static void main(String[] args) {
        String[] arry = {"王京珠,男","马尔扎哈,男","陈奕迅,男"};
        printInfo(arry,
                (a)->{
                    String s = a.split(",")[0];
                    System.out.print("姓名:"+s);
                },
                (b)->{
                    String s =b.split(",")[1];
                    System.out.println("。性别"+s+".");
                });
    }
    public static void printInfo(String[] arr , Consumer<String> c1,Consumer<String> c2){
        for (String message : arr) {
            c1.andThen(c2).accept(message);
        }
    }
}
