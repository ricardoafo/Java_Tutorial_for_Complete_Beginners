package ArrayList;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        System.out.println(numbers.get(2));

        // Indexed for loop iteration
            // Classic loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Classic loop " + "\n" + numbers.get(i));
        }
            // Modern loop
        for (int number : numbers) {
            System.out.println("Modern loop " + "\n" + number);
        }

        // Removing items (careful!)
        numbers.remove(numbers.size() -1);
        System.out.println("First remove");
        arrayLoop(numbers);

        // This is slow
        numbers.remove(0);
        System.out.println("Second remove");
        arrayLoop(numbers);
    }

    public static void arrayLoop(ArrayList<Integer> numberList) {
        for (int number : numberList) {
            System.out.println("Array loop function " + "\n" + number);
        }
    }
}
