package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1InPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\d.txt");
//        byte[] bytes = new byte[5];
//        int read = fis.read(bytes);
//        System.out.println(read);
//        System.out.println(new String(bytes));
//
//        read = fis.read(bytes);
//        System.out.println(read);
//        System.out.println(new String(bytes));

        byte[] bytes1 = new byte[1024];  //存储读取到的字节
        int len = 0 ;                    //记录每次读取的有效字节个数
        while ((len = fis.read(bytes1)) != -1){
            System.out.println(new String(bytes1,0,len)); //offset:数组开始的索引  length：转换字节个数
            System.out.println(len);
        }
        fis.close();


    }
}
