package Generics_And_Wildcards;

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine started");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("Photo taken");
    }
}

public class App {
    public static void main(String[] args) {

        ArrayList<Machine> list = new ArrayList<Machine>();
        list.add(new Machine());
        list.add(new Machine());
        list.add(new Machine());
        showList(list);

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list2.add(new Camera());
        list2.add(new Camera());
        list2.add(new Camera());
        showList2(list2);

    }

    public static void showList(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}
