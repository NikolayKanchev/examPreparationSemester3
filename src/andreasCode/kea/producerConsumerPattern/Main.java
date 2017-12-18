/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.producerConsumerPattern;

/**
 *
 * @author Andrea
 */
public class Main {

    public static void main(String[] args) { 
        SharedData data = new SharedData();
        Sender[] sender = new Sender[SharedData.getNrProducers()];
        Receiver[] receiver = new Receiver[SharedData.getNrConsumers()];
        
        for (int i=0; i<SharedData.getNrProducers(); ++i) {
            sender[i] = new Sender(data, i);
            sender[i].start();
        }
        for (int i=0; i<SharedData.getNrConsumers(); ++i) {
            receiver[i] = new Receiver(data, i);
            receiver[i].start();
        }

    }

    
}
