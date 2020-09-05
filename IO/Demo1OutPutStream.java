package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\c.txt",true);
        for (int i = 0; i <10 ; i++) {
            fos.write("\r\n".getBytes());
            fos.write("你好".getBytes()); 
        }
        fos.close();

    }
}
