package TCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class File_01TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Program Files\\IDde gzqj\\src\\IO\\ax.pdf");
        Socket socket = new Socket("127.8.8.1",8888);
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        socket.shutdownOutput(); //任何以前写入的数据都将被发送

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        socket.close();

    }
}
