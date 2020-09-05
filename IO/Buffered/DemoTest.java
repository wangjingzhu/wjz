package IO.Buffered;

import java.io.*;
import java.util.HashMap;

public class DemoTest {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map  = new HashMap();
        BufferedReader br = new BufferedReader(new FileReader("E:\\Program Files\\IDde gzqj\\src\\IO\\Buffered\\c.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Program Files\\IDde gzqj\\src\\IO\\Buffered\\d.txt"));
        String len;
        while ((len = br.readLine())!=null){
            String[] split = len.split("\\.");
            System.out.println();
            map.put(split[0],split[1]);
        }
        for (String Key:map.keySet()){
            String value = map.get(Key);
            len = Key+"."+value;
            bw.write(len);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
