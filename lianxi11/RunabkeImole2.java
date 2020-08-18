package lianxi11;
//解决线程安全有二种：
// 1.同步代码块  synchronized关键字  (锁对象){          ...     }
// 2.同步方法 public synchronized关键字 void 方法名（参数）
//  静态同步方法  public static synchronized关键字 void 方法名（参数）
public class RunabkeImole2 implements Runnable {
    private int ticket = 100;
    Object object = new Object();  //创建锁对象
    @Override
    public void run() {
//        while (true){
//           synchronized (object){
//               if (ticket>0){
//                   System.out.println(Thread.currentThread().getName() + "正在卖第" +ticket);
//                   ticket--;
//                   try {
//                       Thread.sleep(100);
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//               }
//           }
//        }
        while (true) {
            payTciker();
        }
    }
    public synchronized void payTciker(){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName() + "正在卖第" +ticket);
                    ticket--;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
    }
}
