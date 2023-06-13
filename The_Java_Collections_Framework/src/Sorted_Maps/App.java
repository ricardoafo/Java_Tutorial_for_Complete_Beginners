package Sorted_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class App {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer,String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("HashMap");
        testMap(hashMap);
        System.out.println("LinkedHashMap");
        testMap(linkedHashMap);
        System.out.println("TreeMap");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer,String> map) {
        map.put(9, "fox");
        map.put(7, "turtle");
        map.put(3, "dog");
        map.put(4, "cat");
        map.put(1, "bird");
        map.put(2, "snake");

        for (Integer key : map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
