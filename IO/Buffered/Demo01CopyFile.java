package IO.Buffered;

import java.io.*;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\ax.pdf");
        FileOutputStream fos = new FileOutputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\123\\xx.pdf");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
//          int len = 0 ;
//          while ((len = bis.read()) != -1){
//              bos.write(len);
//          }

         int len = 0 ;
         byte[] bytes = new byte[1024];
         while ((len = fis.read(bytes)) != -1){
             fos.write(bytes,0,len);
         }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制用时间：" + (e-s) + "毫秒" );
    }
}
