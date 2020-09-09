package _File;
   //递归遍历
import java.io.File;

public class Demo_File07 {
    public static void main(String[] args) {
        File file = new File("E:\\Program Files\\IDde gzqj\\src\\_File");
        getAllFile(file);

    }

    public static void getAllFile(File file) {
        System.out.println(file);
        File[] files = file.listFiles(new FileFilterImpl());
        for (File file1 :files){
            if(file1.isDirectory()){
                getAllFile(file1);
            }else {
//                String string = file1.toString();
//                if (string.endsWith(".java")){
//                    System.out.println(file1);
//                }
                if (file1.getName().endsWith(".java")){
                    System.out.println(file1);
                }
            }
        }
    }
}
