package _MyFunctionalInterface;

public class Demo01 {
    public static void show(Runnable run) {
        new Thread(run).start();
    }

    public static void main(String[] args) {

        show(()-> System.out.println(Thread.currentThread().getName()));
    }

}
