package Lianxi9;

import javax.swing.*;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
  private   String name ;
   private int age ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student() {
    }

    //重写comparable接口中的compareTO方法
    @Override
    public int compareTo(Student o) {
        return  this.getAge() - o.getAge();
    }
}
