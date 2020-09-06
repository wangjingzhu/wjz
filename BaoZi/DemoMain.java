package BaoZi;

public class DemoMain {
    public static void main(String[] args) {
        BaoZi baoZi =new BaoZi();
        new ChiHuo(baoZi).start();
        new BaoZiPu(baoZi).start();
    }
}
