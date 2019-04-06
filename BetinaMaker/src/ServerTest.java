

/**
 *
 * @author Katiely
 */


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        int porta= 10 ;
        ServerSocket serverSocket = new ServerSocket(10);
      
        System.out.println("Server running at port  " + porta );
        while (true) {
            Socket socket = serverSocket.accept();

            new SocketBetinaServer(socket).betinaJuros();

        }
    }
}