/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.producerConsumerPattern;

/**
 *
 * @author Andrea
 */
public class Sender extends Thread {
    private SharedData shared;
    private int id;

    public Sender(SharedData shared, int id) {
        this.shared = shared;
        this.id = id;
    }
    
    @Override
    public void run() {
        int dataToProcess = SharedData.getNrData()/SharedData.getNrProducers();
        System.out.println("****** Starting producer " + this.id + " ******");
        for (int i = 0; i < dataToProcess; i++) {
            //System.out.println("Producer " + this.id + " put: " + i);
            shared.put(this.id, i);
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException ex) {
            }
        }
    }

}
        