package ch19.lecturep01network;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Server {
    public static void main(String[] args) {
        int port = 50500;

        System.out.println("연결 기다리는 중....");
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             InputStream is = socket.getInputStream();
             BufferedInputStream bis = new BufferedInputStream(is);
             InputStreamReader isr = new InputStreamReader(bis);) {

            char[] buf = new char[1024];
            int len = 0;
            while ((len = isr.read(buf)) != -1) {
                String data = new String(buf, 0, len);
                System.out.println(data);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("프로그램 종료");
    }
}
