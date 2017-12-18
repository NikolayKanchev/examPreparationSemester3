/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.linkeddata;


/**
 *
 * @author Andrea
 */
public class IntegerListWithNodes implements IntegerListInterface {
    
    private Node head;
    private int size;       

    @Override
    // Add first element to the list 
    public boolean add(int el) {
        Node nNode = new Node(el);
        nNode.setNext(head);
        head = nNode;
        return true;
    }

    @Override
    public int getElement(int idx) throws IntegerListException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void traverseAndPrint() {
        Node current = head;
        while (current != null) {
            System.out.println("Element --> " + current.getData());
            current = current.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }
    
}