package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\c.txt");
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
