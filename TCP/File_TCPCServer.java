package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class File_TCPCServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(8888);
        Socket accept = serversocket.accept();
        InputStream is = accept.getInputStream();
        File file = new File("E:\\Program Files\\IDde gzqj\\src\\TCP");
        if (!file.exists()){
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\服务器图片.pdf");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        OutputStream os = accept.getOutputStream();
        os.write("上传成功！".getBytes());
        fos.close();
        accept.close();
        serversocket.close();

    }
}
