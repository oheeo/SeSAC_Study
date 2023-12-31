package TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class _01_ {
    public static void main(String[] args) {

        System.out.println("<<Client>>");
        try {
            Socket socket = new Socket(InetAddress.getByName("localhost"),
                    10000);
            System.out.println("Server에 접속 완료");
            System.out.println("접속 Server 주소 : "+socket.getInetAddress()+":"+socket.getPort());
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(socket.getOutputStream()));
            dos.writeUTF("안녕하세요");
            dos.flush();
            String str = dis.readUTF();
            System.out.println("server : "+str);
        }
        catch (UnknownHostException e) {}
        catch (IOException e) {e.printStackTrace();}

    }
}
