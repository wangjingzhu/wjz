package IO.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
    public static void main(String[] args) throws IOException {
        show();
        show1();
        show3();
    }

    private static void show3() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("E:\\Program Files\\IDde gzqj\\src\\IO\\Properties\\a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s:set){
            String value = prop.getProperty(s);
            System.out.println(s+"="+value);
        }
    }

    private static void show1() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("委屈","190");
        prop.setProperty("傻空","100");
        FileWriter fw = new FileWriter("E:\\Program Files\\IDde gzqj\\src\\IO\\Properties\\a.txt");
        prop.store(fw,"sava data");      
        fw.close();
    }

    private static void show() {
        Properties prop = new Properties();
        prop.setProperty("委屈","190");
        prop.setProperty("傻空","100");
        Set<String> set = prop.stringPropertyNames();  //把key存到一个set集合
        for (String  s :set){
            String value = prop.getProperty(s);         //通过Key获取Value
            System.out.println(s+value);
        }

    }
}
