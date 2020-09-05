package IO.Object;

import java.io.*;
import java.util.ArrayList;

public class DemoTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Peson p1 = new Peson("我看完",18);
        Peson p2 = new Peson("法人公",16);
        Peson p3 = new Peson("阿萨的",11);
        ArrayList<Peson> list = new ArrayList<>();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
                ("E:\\Program Files\\IDde gzqj\\src\\IO\\Object\\b.txt"));
        list.add(p1);
        list.add(p2);
        list.add(p3);
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\Object\\b.txt"));
        Object O = ois.readObject();
        ArrayList<Peson> list1 = (ArrayList<Peson>)O;
        for (Peson x :list1){
            System.out.println(x);
        }
        ois.close();
        oos.close();
    }
}
