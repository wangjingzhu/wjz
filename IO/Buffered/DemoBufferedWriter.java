package IO.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Program Files\\IDde gzqj\\src\\IO\\Buffered\\b.txt"));
        for (int i = 0; i <10 ; i++) {
            bw.write("让你回去");
//            bw.write("\r\n");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
