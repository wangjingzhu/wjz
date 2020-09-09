package _File;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.IOException;

public class Demo_File03 {
    public static void main(String[] args) throws IOException{
        show();
        show01();
        show02();
    }

    private static void show02() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src\\Hello");
        System.out.println(file.delete());  //删除后面的文件或者文件夹   （删后不在回收站需谨慎）

    }

    private static void show01() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src\\_File\\Hello");
        System.out.println(file.mkdir());  //创建单层文件夹
        File file1 = new File("E:\\Program Files\\IDde gzqj\\src\\_File\\Hello1\\123\\123");
        System.out.println(file1.mkdirs()); //创建多级文件夹
    }

    private static void show() throws IOException {
        File file = new File("E:\\Program Files\\IDde gzqj\\src\\_File\\Hello.java");
        System.out.println(file.createNewFile());    //新建一个文件
    }
}
