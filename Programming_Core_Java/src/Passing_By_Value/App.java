package Passing_By_Value;

public class App {

    public static void main(String[] args) {
        App app = new App();

        int value = 7;
        app.show(value);
    }

    public void show(int value) {
        System.out.println("Value is: " + value);
    }
}
