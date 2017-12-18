/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.threads;

/**
 *
 * @author Andrea
 */
public class MyThreadJoin extends Thread {

    private static final long C_MAX = 500;
    private String name;
    
    public MyThreadJoin(String name) {
        super();
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread() + ": starting");
        // give a chance to another thread to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i< MyThreadJoin.C_MAX; ++i)
            System.out.println("Hello " + name);
        System.out.println("Thread " + Thread.currentThread() + ": exiting");
    }

    public static void main(String [] args) {
        MyThreadJoin t1 = new MyThreadJoin("Andrea");
	t1.start();
        System.out.println("Thread " + Thread.currentThread() + ": starting");
	try {
            t1.join(); // makes main wait for this thread to finish!
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread() + ": exiting");
    }
}
