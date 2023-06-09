package Recursion;

public class App {

    public static void main(String[] args) {

        // E.g 4! = 4*3*2*1
        System.out.println(factorial(5));
    }

    private static int factorial(int value) {

        if (value == 0 || value < 0) {
            System.out.println("Invalid number");
            return 0;
        } else if (value == 1) {
            return 1;
        } else {
            return factorial(value - 1) * value;
        }
    }
}
