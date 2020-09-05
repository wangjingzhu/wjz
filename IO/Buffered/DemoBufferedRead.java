package IO.Buffered;

import java.io.*;

public class DemoBufferedRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\Program Files\\IDde gzqj\\src\\IO\\Buffered\\b.txt"));
        String len ;
        while ((len = br.readLine()) !=null){
            System.out.println(len);
        }
        br.close();
    }
}
