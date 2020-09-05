package IO.PrintStream;

import java.io.IOException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream
                ("E:\\Program Files\\IDde gzqj\\src\\IO\\PrintStream\\打印流目的地.txt");
        System.setOut(ps);
        System.out.println("我在打印流目的地里面");
    }
}
