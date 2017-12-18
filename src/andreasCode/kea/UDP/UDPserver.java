package andreasCode.kea.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class UDPserver
{
    public static void main(String[] args)
    {
        try {
            DatagramSocket serverSocket = new DatagramSocket(4444);
            DatagramPacket dataReceived = null,
                    dataSent = null;


            while (true) {

                System.out.println("Server is up and running ... ");
                byte[] receiveDatagram = new byte[256];
                byte[] sendDatagram = new byte[256];

                dataReceived = new DatagramPacket(receiveDatagram, receiveDatagram.length);
                serverSocket.receive(dataReceived);
                InetAddress ip = dataReceived.getAddress();
                int port = dataReceived.getPort();

                Date now = new Date();
                sendDatagram = now.toString().getBytes();

                dataSent = new DatagramPacket(sendDatagram,sendDatagram.length,ip,port);
                serverSocket.send(dataSent);

            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}