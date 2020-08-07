package lianxi2;

public class dada {
    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        stu1.setAge(17);
        stu1.setName("whz");
        System.out.println("name"+stu1.getName()+"今年"+stu1.getAge());
        System.out.println("______________________________________");
        Student1 stu2 = new Student1("whjz",18);
        System.out.println(stu2.getName()+stu2.getAge());
    }
}
