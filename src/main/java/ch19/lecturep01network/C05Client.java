package ch19.lecturep01network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class C05Client {
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

            String input = "";

            try (Scanner scanner = new Scanner(System.in);) {
                System.out.print("서버에게 보낼 데이터 작성>");
                input = scanner.nextLine();
            }

            ps.println(input);

            ps.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("클라이언트 종료");
    }
}
