package lianxi7;

public interface MyinterfaceB {
    public abstract void send();
    public default void qwe(){
        System.out.println("这是接口中的普通方法");
    }
}
