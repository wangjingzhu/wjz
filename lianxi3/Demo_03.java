package lianxi3;

import java.util.ArrayList;

public class Demo_03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("网啊",12);
        Student student1 = new Student("网",11);
        Student student2 = new Student("网啊啊",10);
        Student student3 = new Student("网啊a a ",9);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (int i = 0; i < list.size(); i++) {
            Student num = list.get(i);
            System.out.println("名字:" + num.getName() + ",年龄:" + num.getAge());
        }
    }
}
