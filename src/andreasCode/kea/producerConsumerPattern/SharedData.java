/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.producerConsumerPattern;

/**
 *
 * @author Andrea
 */
public class SharedData {
    private final static int C_DATA_BLOCK = 10;
    private final static int C_NR_PRODUCER = 1;
    private final static int C_NR_CONSUMERS = 3;
    private final static int C_MAX_DATA = SharedData.C_NR_PRODUCER *
                                          SharedData.C_NR_CONSUMERS *
                                          SharedData.C_DATA_BLOCK;

    private int content; 
    private volatile boolean availableForReading = false;

    public synchronized int get(int id) {
        while (!availableForReading) {
            try { 
                wait();
            } catch (InterruptedException ex) {
            } 
        }
        availableForReading = false;
        System.out.println("Consumer " + id + " gets " + content + " @ time " + System.nanoTime());
        notifyAll();
        return content;
    }
    
    public synchronized void put(int id, int value) {
        while (availableForReading) {
            try { 
                wait();
            } catch (InterruptedException ex) {
            } 
        }
        content = value;
        availableForReading = true;
        System.out.println("Producer " + id + " puts " + content + " @ time " + System.nanoTime());
        notifyAll();
    }
    
    public static int getNrData() {
        return SharedData.C_MAX_DATA;
    }
    
    public static int getNrConsumers() {
        return SharedData.C_NR_CONSUMERS;
    }
    
    public static int getNrProducers() {
        return SharedData.C_NR_PRODUCER;
    }

}

