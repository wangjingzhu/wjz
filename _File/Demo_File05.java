package _File;
   //递归遍历
import java.io.File;
import java.io.IOException;

public class Demo_File05 {
    public static void main(String[] args) {
        File file = new File("E:\\Program Files\\IDde gzqj\\src");
        getAllFile(file);

    }

    public static void getAllFile(File file) {
        System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 :files){
            if(file1.isDirectory()){
                getAllFile(file1);
            }else {
                System.out.println(file1);
            }
        }
    }
}
