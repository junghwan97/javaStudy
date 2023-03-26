package ch19.lecturep01network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C01NetworkServer {
    public static void main(String[] args) {
        // ip 주소
        // port 번호 필요
        int port = 50500;

        try (ServerSocket serverSocket = new ServerSocket(port);) {
            System.out.println("연결 기다리는 중....");
            try (
                    Socket socket = serverSocket.accept();
                    OutputStream os = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    BufferedWriter bw = new BufferedWriter(osw);) {

                bw.write("Hello client");

                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");

    }
}
