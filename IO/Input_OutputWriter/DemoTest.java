package IO.Input_OutputWriter;

import java.io.*;

public class DemoTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\Input_OutputWriter\\我是GBK.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\Input_OutputWriter\\我是UTK-8.txt"),"UTF-8");
        int len = 0 ;
        while ((len = isr.read())!= -1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
