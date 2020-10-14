package cn.itcast._class;

import java.security.PublicKey;

public class Person {
    private String name;
    private int age;
    public String a;
    protected String b;
    String c;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person() {
    }
    public void eat(){
        System.out.println("吃");
    }
    public void eat(String food){
        System.out.println("吃"+food);
    }
}
