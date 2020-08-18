package lianxi11;

public class Demo01Runable {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//        public void run() {
//            for (int i = 0; i <20 ; i++) {
//                System.out.println(Thread.currentThread().getName() + "--->" + i);
//            }
//       }
//    };
//        runnable.run();
        RunableImple runableImple = new RunableImple();
        Thread thread = new Thread(runableImple);
        thread.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
