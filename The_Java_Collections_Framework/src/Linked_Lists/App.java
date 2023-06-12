package Linked_Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("ArrayList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {

        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        // Add items at end of list
        /*
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        */

        // Add items at elsewhere in list
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}