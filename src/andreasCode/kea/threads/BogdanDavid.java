/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.threads;

/**
 *
 * @author Andrea
 */
public class BogdanDavid implements Runnable {

     private long counter = 0;
     
    @Override
    public void run() {
        String nameThread = Thread.currentThread().getName();
        System.out.println(nameThread + " starting run()");
        try {
//            for ( ; ; ) {
//                if (Thread.interrupted()) {
//                //if (Thread.currentThread().isInterrupted()) {
//                    System.out.println(nameThread + " interrupted checking flag");
//                    break;
//                }
            while (!Thread.interrupted()) {
                ++counter;
                System.out.println(counter);
                Thread.sleep(10);   // Blocking method
            }
        } catch (InterruptedException ex) {
            System.out.println(nameThread + " interrupted by interrupt()");
        }
        System.out.println(nameThread + " exiting with counter " + counter);
    }


    public static void main(String args[]) throws InterruptedException {
        Thread t = new Thread(new BogdanDavid(), "test interrupt:");
        t.start();
        Thread.sleep(100);
        System.out.println("Sending interruption from the main() method..");
        t.interrupt();
        System.out.println("Interruption sent from the main() method!");
    }

}
