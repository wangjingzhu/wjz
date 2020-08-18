package lianxi11;
//线程安全
public class DemoTicket {
    public static void main(String[] args) {
        RunabkeImole2 runabkeImole2 = new RunabkeImole2();
        Thread t0 = new Thread(runabkeImole2);
        Thread t1 = new Thread(runabkeImole2);
        Thread t2 = new Thread(runabkeImole2);
        t0.start();
        t1.start();
        t2.start();
    }
}
