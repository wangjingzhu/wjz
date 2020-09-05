package IO.Reader;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\Program Files\\IDde gzqj\\src\\IO\\Reader\\x.txt");
        fw.write(98);
        fw.flush();
        fw.write(99);
        char[] chars = {'w','c','v','c'};
        fw.write(chars);
        fw.write(chars,0,1);        //off:开始的索引   len：写几个
        fw.write("阿斯达克",1,1);
        fw.close();


    }
}
