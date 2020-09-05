package IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class DemoPrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("E:\\Program Files\\IDde gzqj\\src\\IO\\PrintStream\\a.txt");
        ps.write(97);
        ps.println(true);
        ps.println(12);
        ps.println("qwej");
        ps.println('q');
        ps.println(1.2);

    }
}
