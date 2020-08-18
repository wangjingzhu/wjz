package lianxi11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemolockMian2 {
    static int a =100 ;
    public static void main(String[] args) {
        Lock l1 = new ReentrantLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    l1.lock();
                    if (a>0){
                        System.out.println(Thread.currentThread().getName() + "正在卖第" +a);
                        a--;
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    l1.unlock();
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    l1.lock();
                    if (a>0){
                        System.out.println(Thread.currentThread().getName() + "正在卖第" +a);
                        a--;
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    l1.unlock();
                }

            }
        }).start();
    }
}


