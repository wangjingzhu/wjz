package lianxi8;

public class DemoMain {
    public static void main(String[] args) {
        MyInterface my = new MyInterface() {
            @Override
            public void NMD() {
                System.out.println("匿名内部类实现了！");
            }
        };
        my.NMD();
        MyInterface my1= new MyInterface() {
            @Override
            public void NMD() {
                System.out.println("匿名内部类1实现了！！");
            }
        };
        my1.NMD();
        new MyInterface() {
            @Override
            public void NMD() {
                System.out.println("匿名内部类+匿名对象实现了！！！");
            }
        }.NMD();
    }
}
