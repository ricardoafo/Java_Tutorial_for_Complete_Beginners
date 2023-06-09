package Enums_Types_Basic_And_Advance_Usage;

public enum Animal {
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

    private final String name;

    private Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal is called " + name;
    }
}
