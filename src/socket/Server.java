package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by huan on 2017/10/12.
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12234);
            System.out.println("server before accept");
            Socket socket = serverSocket.accept();
            System.out.println("server after accept");

            // 接收客户端的内容
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder builder = new StringBuilder();
            String line = "";
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            System.out.println("server recv " + builder.toString());

            // 回复客户端
//            OutputStream os = socket.getOutputStream();
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
//            writer.write("reply from server");
//            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
