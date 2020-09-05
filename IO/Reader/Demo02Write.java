package IO.Reader;
  //try catch处理异常
import java.io.FileWriter;
import java.io.IOException;

public class Demo02Write {
    public static void main(String[] args)  {
        FileWriter fw =null;
        try {
             fw = new FileWriter("x:\\Program Files\\IDde gzqj\\src\\IO\\Reader\\c.txt",true);
            for (int i = 0; i <10 ; i++) {
                fw.write("Hellow"+i);
                fw.write("\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if (fw !=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
