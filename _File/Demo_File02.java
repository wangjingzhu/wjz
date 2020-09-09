package _File;

import java.io.File;

public class Demo_File02 {
    public static void main(String[] args) {
        show();
        show1();
    }

    private static void show1() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        if (file.exists()){
            System.out.println(file.isDirectory());  //判断路径结尾是否为文件夹
            System.out.println(file.isFile());       //判断路径结尾是否为文件
        }
        File file1 = new File("E:\\Program Files\\IDde gzqj\\WJZ.iml");
        if (file1.exists()){
            System.out.println(file1.isDirectory());  //判断路径结尾是否为文件夹
            System.out.println(file1.isFile());       //判断路径结尾是否为文件
        }

    }

    private static void show() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        System.out.println(file.exists());  //判断文件夹或文件是否存在
        File file1 = new File("E:\\Program Files\\IDde gzqj\\src\\lianxi1");
        System.out.println(file1.exists());
        File file2 = new File("WJZ.iml");
        System.out.println(file2.exists());
    }
}
