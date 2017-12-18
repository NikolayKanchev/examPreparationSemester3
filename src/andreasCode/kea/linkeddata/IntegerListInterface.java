/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.linkeddata;

/**
 *
 * @author Andrea
 */
public interface IntegerListInterface {
    boolean add(int el);
    int getElement(int idx) throws IntegerListException;
    boolean isEmpty();
    int size();
}
