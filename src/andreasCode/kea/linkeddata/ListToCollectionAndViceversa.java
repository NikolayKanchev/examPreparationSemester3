/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andreasCode.kea.linkeddata;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class ListToCollectionAndViceversa {

    public static void main(String[] args) {
        String[] names = {"Lara", "Chiara"};        
        List<String> llist = new LinkedList<>(Arrays.asList(names));

        llist.add(1, "Elisa");
        ((LinkedList) llist).addFirst("One");

        names = llist.toArray(new String[llist.size()]);
        for (String name : names)
            System.out.println(name);
    }

}
