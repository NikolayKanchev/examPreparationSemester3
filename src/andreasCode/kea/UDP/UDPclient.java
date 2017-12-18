package andreasCode.kea.UDP;

import java.io.IOException;
import java.net.*;

public class UDPclient
{
    public static void main(String[] args)
    {
        try {
            DatagramSocket clientSocket = new DatagramSocket();

            InetAddress ip = InetAddress.getByName("localhost");

            byte[] receiveDatagram = new byte[256];

            byte[] sendDatagram = new byte[256];

            DatagramPacket sendData = new DatagramPacket(sendDatagram,sendDatagram.length,ip,4444);

            DatagramPacket receiveData = new DatagramPacket(receiveDatagram,receiveDatagram.length);

            clientSocket.send(sendData);

            clientSocket.receive(receiveData);

            String timeFromServer = new String(receiveData.getData());

            System.out.println("Time from server: " + timeFromServer);

            clientSocket.close();

        } catch (SocketException ex) {

        } catch (UnknownHostException ex) {

        } catch (IOException ex) {

        }
    }
}
