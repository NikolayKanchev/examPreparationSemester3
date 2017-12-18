package andreasCode.kea.servetMultyCast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastingReceiver
{
    public static void main(String[] args)
    {
        try
        {
            int port = 4444;
            String group = "224.0.0.0"; //"225.4.5.6";

            System.out.println("MultiCasting receiver listening... ");
            MulticastSocket socket = new MulticastSocket(port);
            // join the multicast group
            socket.joinGroup(InetAddress.getByName(group));

            // Create a DatagramPacket and start receiving data
            byte buf[] = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            System.out.println("Received data from: " + packet.getAddress().toString() +
                    ":" + packet.getPort() + " and length: " + packet.getLength());
            System.out.write(packet.getData(), 0, packet.getLength());
            System.out.println();

            socket.leaveGroup(InetAddress.getByName(group));
            socket.close();
            System.out.println("MultiCasting receiver done!");

        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

}
