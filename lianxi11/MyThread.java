package lianxi11;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run" + i);
        }
//        String name = getName();
//        System.out.println(name);
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}
