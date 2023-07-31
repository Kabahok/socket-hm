import client.SocketClient;
import server.SocketServer;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> SocketServer.main(args));
        Thread thread2 = new Thread(() -> SocketClient.main(args));

        thread1.start();
        thread2.start();
    }
}
