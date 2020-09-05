package IO.Reader;

import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\Program Files\\IDde gzqj\\src\\IO\\Reader\\z.txt");
//        int len = 0 ;
//        while ((len = fr.read()) != -1){
//            System.out.print((char)len);
//        }
        char[] chars = new char[1024];
//        int read = fr.read(chars);
//        System.out.println(chars);
        int len = 0;
        while ((len = fr.read(chars)) != -1){
            System.out.println(chars);
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
