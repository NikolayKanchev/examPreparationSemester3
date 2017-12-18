package list.linkedList;

public class MyLinkedList implements ListInterface
{
    private int[] array;
    private int size, CAPACITY = 4;

    public MyLinkedList() {
        array = new int[CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(int number) {
        if (size >= array.length) {
            System.out.println("Not enough space in the list to store new elements");
            return false;
        }
        array[size++] = number;
        return true;
    }

    @Override
    public int getElement(int index){
        if ((index >= 0) && (index < size)) {
            return array[index];
        }
        return -111;
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
}
