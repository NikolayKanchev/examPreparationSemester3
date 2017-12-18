/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.simplecollections;


/**
 *
 * @author Andrea
 */
public class IntegerListMain {

    public static void main(String[] args) {
        IntegerList iList = new IntegerList();
        iList.add(9);
        iList.add(8);
        iList.add(6);
        iList.add(10);
        iList.printInfo();
        System.out.println("Size of  my list of integer " + iList.size());
        try {
            System.out.println("Element at position 3 is " + iList.getElement(3));
        } catch (IntegerListException ex) {
            ex.printStackTrace();
        }
        iList.add(11);
        iList.printInfo();
    }

}
