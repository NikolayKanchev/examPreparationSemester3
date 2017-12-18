/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.threads;

/**
 *
 * @author Andrea
 */
public class MyThread extends Thread {
                      //implements Runnable {

    private static final long C_MAX = 20;
    private String name;
    
    public MyThread(String name) {
        super();
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 0; i< MyThread.C_MAX; ++i)
            System.out.println("Hello " + name);
    }

    public static void main(String [] args) {
	MyThread t1 = new MyThread("Andrea");
	MyThread t2 = new MyThread("students!");
	t1.start();
        t2.start();
        
//        MyThread task1 = new MyThread("Andrea");
//	MyThread task2 = new MyThread("students!");
	//Thread thread1 = new Thread(task1);
        //Thread thread2 = new Thread(task2);
//        thread1.start();
//        thread2.start();
    }
}
