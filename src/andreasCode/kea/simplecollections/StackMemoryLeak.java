/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.simplecollections;

/**
 *
 * @author Andrea
 */
public class StackMemoryLeak {

    private Integer[] elements;
    private int size;
    private static final int C_MAX_CAPACITY = 10;

    public StackMemoryLeak() {
        elements = new Integer[StackMemoryLeak.C_MAX_CAPACITY];
    }

    public void push(Integer el) throws IntegerListException
    {
        if (size == elements.length) {
            throw new IntegerListException();
        }
        elements[size++] = el;
    }

    public Integer peack() throws IntegerListException
    {
        if (size > 0) {
            return elements[size];
        } else {
            throw new IntegerListException();
        }
    }
        
    public Integer pop() throws IntegerListException
    {
        if (size > 0) {
            return elements[--size];
        } else {
            throw new IntegerListException();
        }
    }

      
    public Integer _pop() throws IntegerListException
    {
        if (size > 0) {
            //return elements[--size];      // <--- gotta lot of memory leaks here!
            Integer poppedint = elements[size-1];
            elements[size-1] = null;
            --size;
            return poppedint;
        } else {
            throw new IntegerListException();
        }
    }
    
}
