package socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by huan on 2017/10/12.
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 12234); // 0-65535
            OutputStream os = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            writer.write("hello i am client");
            writer.flush();

            // 接收服务端的回复
//            InputStream is = socket.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//            StringBuilder builder = new StringBuilder();
//            String line = "";
//            while ((line = reader.readLine()) != null) {
//                builder.append(line);
//            }
//            System.out.println("client recv " + builder.toString());
//            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}