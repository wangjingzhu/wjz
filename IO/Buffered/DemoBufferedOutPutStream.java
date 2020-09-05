package IO.Buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBufferedOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\Buffered\\a.txt");
        BufferedOutputStream buffered = new BufferedOutputStream(fos);
        buffered.write("写入到缓存池中".getBytes());
        buffered.flush();
        buffered.close();
    }
}
