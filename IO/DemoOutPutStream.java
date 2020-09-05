package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DemoOutPutStream {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\a.txt");
//        fos.write(97);
//        fos.close();
        FileOutputStream fos = new FileOutputStream(new File("E:\\Program Files\\IDde gzqj\\src\\IO\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes = {-65,-66,67,68,69};
        fos.write(bytes);
        fos.write(bytes,3,2);
        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);
        fos.close();
    }
}
