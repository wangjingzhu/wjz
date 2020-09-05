package IO.Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Write {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\Program Files\\IDde gzqj\\src\\IO\\Reader\\c.txt",true);
        for (int i = 0; i <10 ; i++) {
            fw.write("Hellow"+i);
            fw.write("\r\n");
        }
        fw.close();
    }
}
