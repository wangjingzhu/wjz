package BaoZi;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheardPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3); //创建线程池放3个线程
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.shutdown(); //销毁
    }
}
