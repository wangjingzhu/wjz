package quote;

public class Husband {
    public void buyhouse(){
        System.out.println("买房子");
    }
    public static void jiehun(Richable rb){
        rb.buy();
    }

    public  void  sohapply(){
        jiehun(this::buyhouse);
    }

    public static void main(String[] args) {
        new Husband().sohapply();
    }
}
