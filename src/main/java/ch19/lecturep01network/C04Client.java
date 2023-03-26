package ch19.lecturep01network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class C04Client {
    public static void main(String[] args) {
        // ip주소
        String ip = "192.168.0.11";
        // port 번호
        int port = 50500;
        try (
                Socket socket = new Socket(ip, port);
                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
                PrintStream ps = new PrintStream(bos);) {
            ps.println("hello server, I am nick");

            ps.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("클라이언트 종료");
    }
}
