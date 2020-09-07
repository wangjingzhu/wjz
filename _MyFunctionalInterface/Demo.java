package _MyFunctionalInterface;

public class Demo {
    public static void showlog(int level ,MyFunctionallnterface mb){
        if (level == 1){
            System.out.println(mb.BuiderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "qwe";
        String msg2 = "asd";
        String msg3 = "zxc";
        showlog(1,()->{
            return msg1+msg2+msg3;
        });
    }
}
