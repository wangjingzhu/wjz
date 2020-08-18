package lianxi11;

public class DemoInnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+ "匿名内部类"+ i);
                }
            }
        }.start();
       new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i <20 ; i++) {
                   System.out.println(Thread.currentThread().getName()+ "匿名类匿名接口" + i);
               }
           }
       }).start();
    }
}
