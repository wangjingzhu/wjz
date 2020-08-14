package lianxi7;

public interface MyinterfA {
    public abstract void show();
    public default void qwe(){
        System.out.println("这是接口中的普通方法");
    }
}
