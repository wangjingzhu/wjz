package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\a.txt");
        FileOutputStream fos = new FileOutputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\123\\a.txt");
//        int len = 0 ;
//        while ((len = fis.read()) != -1){
//            fos.write(len);
//        }

       int len = 0 ;
       byte[] bytes = new byte[1024];
       while ((len = fis.read(bytes)) != -1){
           fos.write(bytes,0,len);
       }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制用时间：" + (e-s) + "毫秒" );
    }
}
