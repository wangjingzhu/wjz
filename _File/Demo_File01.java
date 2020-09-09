package _File;

import java.io.File;

public class Demo_File01 {
    public static void main(String[] args) {
        show();
        show01();
        show02();
        show03();
    }

    private static void show03() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src\\_File\\Demo_File01.java");
        File file1 = new File("E:\\Program Files\\IDde gzqj\\src\\_File\\1.java");
        System.out.println(file.length());
        System.out.println(file1.length());   //不存在文件或者文件夹为0
    }

    private static void show02() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        File file1 = new File("E:\\Program Files\\IDde gzqj\\src\\123123.txt");
        System.out.println(file1.getName());
        System.out.println(file.getName());
    }

    private static void show01() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        File file1 = new File("a.txt");
        System.out.println(file.getPath());
        System.out.println(file1.getPath());
        System.out.println(file1.toString());
    }

    private static void show() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        File file1 =new File("a.txt");
        System.out.println(file1.getAbsolutePath());
    }
}
