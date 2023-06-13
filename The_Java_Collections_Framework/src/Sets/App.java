package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // HashSet does not retain order
        // Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order you added item in
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sort in natural order
        Set<String> set1 = new TreeSet<String>();

        set1.add("dog");
        set1.add("cat");
        set1.add("bird");
        set1.add("snake");

        // Adding duplicates does nothing
        set1.add("snake");

        System.out.println(set1);

        // Iteration
        for (String element : set1) {
            System.out.println(element);
        }

        // Does Set contains a given item?
        if (set1.contains("dog")) {
            System.out.println("true");
        }

        if (set1.contains("bear")) {
            System.out.println("true");
        }

        // set2  contains some common elements with set1, and some new
        Set<String> set2 = new TreeSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("bear");
        set2.add("snake");
        set2.add("bird");
        set2.add("monkey");
        set2.add("giraffe");

        // Interception
        Set<String> interception = new HashSet<String>(set1);

        interception.retainAll(set2);
        System.out.println(interception);

        // Difference
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }
}
