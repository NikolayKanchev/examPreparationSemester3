package list;

import java.util.*;

public class ListAndLoops
{
    public static void main(String[] args)
    {
        List<String> list1 = new ArrayList<>();

        list1.add("Text 1");
        list1.add("Text 2");
        list1.add("Text 3");


        List<String> list2 = new LinkedList<>();
        list2.add("Text 4");
        list2.add("Text 5");
        list2.add("Text 6");

        List<String> list3 = new Vector<>();
        list3.add("Text 7");
        list3.add("Text 8");
        list3.add("Text 9");

        //Iterator
        Iterator<String> iterator = list1.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //ListIterator
        ListIterator<String> listIterator = list2.listIterator();

        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }
}
