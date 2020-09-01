package TCPtest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String readLine = br.readLine(); //获取第一行读出来
                        System.out.println(readLine);
                        String[] s = readLine.split(" ");  //把读取的信息切割，两个空格只要中间部分
                        String htmlpath = s[1].substring(1);   //啊中间部分路径前面的/截取掉，只要后面
                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = socket.getOutputStream();
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());         //写入HTTP协议响应头，固定写法
                        os.write("Content-Type:text/html\n\n".getBytes());
                        os.write("\r\n".getBytes());
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }

                }
            }).start();

        }
    }
}
