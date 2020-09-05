package IO.Input_OutputWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DemoOutputSteamWriter {
    public static void main(String[] args) throws IOException {
        writ_utf_8();

    }

    private static void writ_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream
                ("E:\\Program Files\\IDde gzqj\\src\\IO\\Input_OutputWriter\\a.txt"),"utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
