package map;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

/**
 * First version of loop*/
        for(int key: map.keySet())
        {
            System.out.println(key + "\t" + map.get(key));
        }

/**
 * Second version of loop*/
//        map.forEach((k, v) -> System.out.println(k + "\t" + v));



/**
 * Third version of loop*/
//        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext())
//        {
//            Map.Entry<Integer, String> entry = iterator.next();
//
//            System.out.println(entry.getKey()+ "\t" + entry.getValue());
//        }

    }
}
