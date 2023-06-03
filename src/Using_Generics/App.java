package Using_Generics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class App {
    public static void main(String[] args) {

        //// Before Java 5 ////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(0);

        System.out.println(fruit);
        System.out.println(list);

        //// Modern Style ////
        ArrayList<String> strings = new ArrayList<>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);
        System.out.println(strings);

        //// There can be more than one type argument ////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //// Java 7 Style ////
        ArrayList<Animal> someList = new ArrayList<>();

    }
}
