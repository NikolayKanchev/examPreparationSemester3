/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.linkeddata;

/**
 *
 * @author Andrea
 */
public class Node {
  
    private int data;  
    private Node next;
              
    public Node(int el) {  
        data = el;  
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next node to set
     */
    public void setNext(Node next) {
        this.next = next;
    }   
      
}