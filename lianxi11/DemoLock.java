package lianxi11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock implements Runnable {
    private int ticket = 100;
    Lock l = new ReentrantLock();  //成员变量地方定义lock对象
    public void run() {
          while (true){
              l.lock();
              if (ticket>0){
                  System.out.println(Thread.currentThread().getName() + "正在卖第" +ticket);
                  ticket--;
                  try {
                      Thread.sleep(10);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              l.unlock();
          }
    }


}
