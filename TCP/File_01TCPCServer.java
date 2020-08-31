package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class File_01TCPCServer {
    public static void main(String[] args) throws IOException {
            ServerSocket serversocket = new ServerSocket(8888);
        while (true){
            new Thread(new Runnable() {       //利用多线程增加效率
                @Override
                public void run() {
                    try {
                        Socket accept = serversocket.accept();
                        InputStream is = accept.getInputStream();
                        //定义一个文件命名规则：防止同名被覆盖  规则：域名+毫秒值+随机数
                        String fileName = "itcast"+System.currentTimeMillis()+new Random().nextInt(9999999)+".pdf";
                        File file = new File("E:\\Program Files\\IDde gzqj\\src\\TCP");
                        if (!file.exists()){
                            file.mkdir();
                        }
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes))!= -1){
                            fos.write(bytes,0,len);
                        }
                        OutputStream os = accept.getOutputStream();
                        os.write("上传成功！".getBytes());
                        fos.close();
                        accept.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();

        }
    }
}
