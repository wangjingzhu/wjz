package lianxi5;

public class Demo_01 {
    public static void main(String[] args) {
        wqe w = new wqe("qweq",19);
        wqe w1 = new wqe("qweqq",10);
        wqe.room ="1021";
        System.out.println(w.getName()+w.getAge()+wqe.room);
        System.out.println(w1.getName()+w1.getAge()+wqe.room);
    }

    public static void waj(String[] args) {
        wqe w3 = new wqe("qwe",12);
        System.out.println(w3.getName());

    }
}
