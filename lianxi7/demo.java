package lianxi7;
//abstrack抽象类
//default默认方法
//static静态方法
public interface demo {

    public static final int NUM = 10;

    public abstract void methodAbs1();

    public default void methodAbs2(){
        System.out.println("这是一个默认方法");
        methodAbs4();
    }
    public static void methodAbs3(){
        System.out.println("这是一个接口的静态方法");
    }
    private  void methodAbs4(){
        System.out.println("一个不公开的方法");
    }

}
