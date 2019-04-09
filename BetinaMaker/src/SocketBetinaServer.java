
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.math.*;
import javax.swing.JOptionPane;

import java.util.*;
import java.nio.ByteBuffer;
/**
 *
 * @author Katiely
 */
public class SocketBetinaServer {
    private final Socket socket;

    public SocketBetinaServer(Socket socket) {
        this.socket = socket;
    }

    public void betinaJuros() throws IOException {
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        float v0 = in.readFloat();
        float vf = in.readFloat();
        int year = in.readInt();
        double juros = (Math.pow( (vf/v0) , 1.0/year)-1.0);
        out.writeDouble(juros);
        //JOptionPane.showMessageDialog(null,"O taxa é : "+ String.valueOf(juros) );
        in.close();
        out.close();
        socket.close();
    }
}
