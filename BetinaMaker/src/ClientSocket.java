
/**
 * UDP Client
 * @author Katiely
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class ClientSocket {


   public double betinaJuros(float v0, float vf,int year) throws IOException {
       double juros;
       try (Socket socket = new Socket("localhost", 3333)) {
           DataOutputStream out = new DataOutputStream(socket.getOutputStream());
           DataInputStream in = new DataInputStream(socket.getInputStream());
           out.writeFloat(v0);
           out.writeFloat(vf);
           out.writeInt(year);
           juros = in.readDouble();
           in.close();
           out.close();
       }
		
        return juros;
    }
}
