package IO.Input_OutputWriter;

import java.io.*;

public class DemoOutputSteamReader {
    public static void main(String[] args) throws IOException {
        writ_utf_8();

    }

    private static void writ_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\Input_OutputWriter\\a.txt"));
        int len = 0;
        while ((len =isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
