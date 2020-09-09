package _File;

import java.io.File;

public class Demo_File {
    public static void main(String[] args) {
        show();
        show1("c:\\","a.txt");
        show2();
    }

    private static void show2() {
        File a2 = new File("c:\\");
        File a3 = new File(a2,"Hello.java");
        System.out.println(a3);
    }

    private static void show1(String parent,String child) {
        File a1 = new File(parent,child);
        System.out.println(a1);
    }

    private static void show() {
        File a = new File("E:\\Program Files\\IDde gzqj\\src");
        System.out.println(a);
    }
    
}
