/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.synchAndAdvanced;

/**
 *
 * @author Andrea
 */
public class SharedData {

    private int value;

    public SharedData() {
        value = 0;  
    }

    public int getValue() {
    //public synchronized int getValue() {
        return value;
    }

    public void setValue(int value) {
    //public synchronized void setValue(int value) {
        this.value = value;
    }
  
    //public void decrease() {    
    public synchronized void decrease() {    
        --value;
    }

    //public void increase() {    
    public synchronized void increase() {    
        ++value;
    }

}