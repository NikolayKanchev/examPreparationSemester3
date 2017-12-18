/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.synchAndAdvanced;

/**
 *
 * @author Andrea
 */
public class SharedDataAccess extends Thread {
    
    private static final int C_MAX = 100000000;  
    private SharedData mydata = null;
	
      
    public SharedDataAccess(SharedData data) {
        mydata = data;
    }
	  
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() +
                " starting... ");
	for (int i = 0; i< SharedDataAccess.C_MAX; ++i) {
            mydata.decrease();
        }
        System.out.println("Thread " + Thread.currentThread().getName() +
                " ended!");
    }


    public static void main(String [] args) throws InterruptedException {
        System.out.println("Thread " + Thread.currentThread().getName() +
                " starting... ");
        SharedData data = new SharedData();
	SharedDataAccess t = new SharedDataAccess(data);
	t.start();
        for (int i = 0; i< SharedDataAccess.C_MAX; ++i) {
            data.increase();
        }
        
        t.join();
       
        System.out.println("Thread " + Thread.currentThread().getName() +
                " ended with value --> " + data.getValue());   
        
    }
    
}
