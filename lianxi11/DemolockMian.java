package lianxi11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemolockMian {
    static int a =100 ;
    public static void main(String[] args) {
         DemoLock demoLock = new DemoLock();
          Thread t0 = new Thread(demoLock);
          Thread t1 = new Thread(demoLock);
          Thread t2 = new Thread(demoLock);
          t0.start();
          t1.start();
          t2.start();
    }
}


