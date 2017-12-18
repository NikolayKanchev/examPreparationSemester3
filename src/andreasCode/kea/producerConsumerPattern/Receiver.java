/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.producerConsumerPattern;

/**
 *
 * @author Andrea
 */
public class Receiver extends Thread {
    private SharedData shared;
    private int id;

    public Receiver(SharedData shared, int id) {
        this.shared = shared;
        this.id = id;
    }

    @Override
    public void run() {
        int dataToProcess = SharedData.getNrData()/ SharedData.getNrConsumers();
        System.out.println("****** Starting consumer " + this.id + " ******");
        for (int i = 0; i < dataToProcess; i++) {
            int value = shared.get(this.id);
            //System.out.println("Consumer " + this.id + " received: " + value);
        }
    }

}
