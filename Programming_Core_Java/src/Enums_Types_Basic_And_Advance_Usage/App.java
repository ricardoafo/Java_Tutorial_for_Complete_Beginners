package Enums_Types_Basic_And_Advance_Usage;

public class App {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case DOG -> System.out.println("Dog");
            case CAT -> System.out.println("Cat");
            case MOUSE -> System.out.println("Mouse");
            default -> System.out.println("Animal doesn't exists");
        }

        System.out.println(Animal.MOUSE.getName());
        System.out.println(Animal.CAT.toString());
    }
}
