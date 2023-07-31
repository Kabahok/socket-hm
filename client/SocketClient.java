package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8080;

    public static void main(String[] args) {
        try(Socket clientSocket = new Socket(HOST, PORT);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            out.println("Egor");
            System.out.println("Сообщение отправлено");

            System.out.println("Ответ от сервера: " +  in.readLine());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
