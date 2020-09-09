package _File;

import java.io.File;
import java.io.IOException;

public class Demo_File04 {
    public static void main(String[] args) throws IOException{
        show();
        show01();

    }

    private static void show01() {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        File[] files = file.listFiles();  //遍历一个目录里所有的文件和文件夹，并把打印整个v绝对路径
                                            // 并且放在file数组里
        for (File f : files ){
            System.out.println(f);
        }
    }

    private static void show() throws IOException {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        String[] arr = file.list();    //遍历一个目录里所有文件或文件夹，并放进一个String数组里
        for (String list : arr)
        System.out.println(list);

    }
}
