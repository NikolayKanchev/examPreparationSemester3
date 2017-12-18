package andreasCode.kea;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TimeClient
{
    /**
     *
     * @author Andrea
     *
     * Getting the time from a time server at NIST
     * http://tf.nist.gov/tf-cgi/servers.cgi
     *
     * The NIST format : is  JJJJJ YR-MO-DA HH:MM:SS TT L H msADV UTC(NIST) OTM.
    Example: 53746 06-01-11 21:28:49 00 0 0 266.1 UTC(NIST) *
    JJJJJ - the Julian Date is : 53746
    YR-MO-DA - the Date is : 2006-01-11
    HH:MM:SS - the Time in UTC is : 21:28:49
    TT - Indication whether USA is on Standard Time (ST) or Daylight Saving Time (DST) : 00 (Standard Time)
    L - Leap second at the end of the month (0: no, 1: +1, 2: -1) : 0
    H - Health of the server (0: healthy, >0: errors) : 0
    msADV - time code advanced in milliseconds to compensate network delays : 266.1
    UTC(NIST) - the originator of this time code : UTC(NIST)
    OTM - on-time marker : *
     *
     */
    public static void main(String[] args) {

        String host = "time-a.nist.gov";
        try {
            int data;
            while (true) {
                Socket socket = new Socket(host, 13);
                InputStream timeStream = socket.getInputStream();
                StringBuilder timeFromServer = new StringBuilder();
                while ((data = timeStream.read()) != -1) {
                    timeFromServer.append((char) data);
                }
                System.out.println("Now the time is: " + timeFromServer.toString().trim());
                socket.close();
                Thread.sleep(5000);
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
