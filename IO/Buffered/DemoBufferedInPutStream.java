package IO.Buffered;

import java.io.*;

public class DemoBufferedInPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\Buffered\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
//        int len = 0 ;
//        while ((len = bis.read()) != -1 ){
//            System.out.println(len);
//        }
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
