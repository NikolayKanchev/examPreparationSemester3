package andreasCode.kea.servetMultyCast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSender {

    public static void main(String[] args) {
        try {
            int port = 4444;
            String group = "224.0.0.0"; //225.4.5.6";

            System.out.println("Multicast broadcasting to " + group + ":" + port);
            // Create the socket but we don't bind it as we are only going to send data
            MulticastSocket socket = new MulticastSocket();

            byte buf[] = new byte[256];
            buf = "Hello my lovely students!".getBytes();

            // Create a DatagramPacket
            DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName(group), port);
            socket.send(packet);
            socket.close();
            System.out.println("Multicast broadcasting done!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
