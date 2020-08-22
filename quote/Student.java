package quote;

public class Student {
    public static void show(String name,NEWpreson p){
        Preson preson = p.get(name);
        System.out.println(preson.getName());
    }

    public static void main(String[] args) {
        show("阿瑟东",Preson::new);
    }
}
