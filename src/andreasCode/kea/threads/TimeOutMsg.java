/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.threads;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Andrea
 */
public class TimeOutMsg {
    private Timer timer;

    public TimeOutMsg(int secs) {
        timer = new Timer();
        System.out.println("The exam started now!");
        timer.schedule(new TimeIsUp(),secs*1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("The exam is over (5secs)!");
                //timer.cancel(); 
            }
        },secs*500);
    }

    class TimeIsUp extends TimerTask {
        @Override
        public void run() {
            System.out.println("The exam is over (10sec)!");
            //timer.cancel(); 
        }
    }

    public static void main(String args[]) {
        new TimeOutMsg(10);
    }
}
