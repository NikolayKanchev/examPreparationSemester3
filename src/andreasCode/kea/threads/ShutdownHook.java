/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.threads;

/**
 *
 * @author Andrea
 */
public class ShutdownHook {
    
    public void attachShutdownHook(){
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("I am the 'bye bye' message which you did not expect");
            }
        });
    }
    
    public static void main(String[] args) {
        ShutdownHook sample = new ShutdownHook();
        sample.attachShutdownHook();
        
        System.out.println("Leaving code.... it should print nothing after this line...");
        System.exit(0);
    }
    
}