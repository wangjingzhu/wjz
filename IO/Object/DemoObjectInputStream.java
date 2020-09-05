package IO.Object;
//对象反序列化
import java.io.*;

public class DemoObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                ("E:\\Program Files\\IDde gzqj\\src\\IO\\Object\\a.txt"));
        Object o = ois.readObject();
        ois.close();
        Peson o1 = (Peson) o;
        System.out.println(o1.getName()+o1.getAge());
    }
}
