package lianxi11;
public class DemoWaitAndNotify2 {
    public static void main(String[] args) {
        Object object =new Object();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (object){
                        System.out.println("买包子了!");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("吃完了");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (object){
                        System.out.println("1买包子了!");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("1吃完了");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object){
                        System.out.println("包子做好了！");
                        object.notifyAll();
                    }
                }
            }
        }.start();
    }
}
