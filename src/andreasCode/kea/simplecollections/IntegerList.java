/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.simplecollections;

/**
 *
 * @author Andrea
 */
public class IntegerList implements IntegerListInterface
{

    private int[] array;
    private int size,
                C_DEFAULT_CAPACITY = 4;

    public IntegerList() {
        array = new int[C_DEFAULT_CAPACITY];
        size = 0;
    }

//    @Override
//    public boolean add(int el) throws IntegerListException {
//        if (size >= array.length) {
//            throw new IntegerListException();
//        }
//        array[size++] = el;
//        return true;
//    }

    @Override
    public boolean add(int el) {
        if (size >= array.length) {
            //dynamicallyExpandMyBackbonearray();
            System.out.println("Not enough space in the list to store new elements");
            return false;
        }
        array[size++] = el;
        return true;
    }

    @Override
    public int getElement(int idx) throws IntegerListException
    {
        if ((idx >= 0) && (idx < size)) {
            return array[idx];
        } else {
            throw new IntegerListException();
        }
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }
    
    public void printInfo() {
        for (int i=0; i<size; ++i)
            System.out.println((i+1) + " -> " + array[i]);
    }
    
    private void dynamicallyExpandMyBackbonearray() {
        int[] newarray = new int[array.length*2];
        // copy each element of array into newarray
        System.arraycopy(array,0, newarray,0, array.length);
        array = newarray;
    }

}
