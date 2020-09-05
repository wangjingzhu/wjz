package IO.Object;
//对象序列化
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
                ("E:\\Program Files\\IDde gzqj\\src\\IO\\Object\\a.txt"));
        oos.writeObject(new Peson("阿达",12));
        oos.close();

    }
}
