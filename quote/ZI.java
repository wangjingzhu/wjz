package quote;

public class ZI extends Demo_FU {


    public static void method(Greetable gt){
        gt.greet();
    }

    public  void show(){
        method(super::wan);
    }

    public static void main(String[] args) {
        new ZI().show();
    }

}
