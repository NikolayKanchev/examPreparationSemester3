/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.simplecollections;

/**
 *
 * @author Andrea
 */
public interface IntegerListInterface {
    boolean add(int el);
    //boolean add(int el) throws IntegerListException;
    int getElement(int idx) throws IntegerListException;
    boolean isEmpty();
    int size();
}
