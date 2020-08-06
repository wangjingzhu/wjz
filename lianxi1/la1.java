package lianxi1;
class la2{
    private String name;
    private int age;
    private String sex;

    public la2(){
        this.name="wzj";
        this.age=12;
        this.sex="男";
    }

    public void show(){
        System.out.println(this.name+this.age+this.sex);
    }
}
public class la1 {

    public static void main(String[] args) {
        la2 la = new la2();
        la.show();
    }
}

