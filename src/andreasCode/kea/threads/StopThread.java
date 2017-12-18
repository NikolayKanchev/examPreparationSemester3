/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.threads;

import javax.swing.*;

/**
 *
 * @author Andrea
 */
class StopThread extends Thread {
    
    private volatile boolean stop = false;
	
    public void stopIt() {
        stop = true;	
    }
	
    @Override
    public void run() {
        int counter = 0;
        while (!stop) {
            System.out.println(counter++);
        }
        System.out.println("Exiting thread...");
    }
    
    public static void main(String[] args) throws InterruptedException {
        StopThread st = new StopThread();
        st.start();
        Thread.sleep(100);
        Object[] options = {"OK"};
        int input = JOptionPane.showOptionDialog(null,
                            "Stop my thread now!", "Stop thread",
                            JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
                            null, options, options[0]);
        if (input == JOptionPane.OK_OPTION) {
            st.stopIt();
            //st.stop();
        }

    }
}
