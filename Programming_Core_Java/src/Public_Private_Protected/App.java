package Public_Private_Protected;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Oak oak = new Oak();
        System.out.println(plant.name);
        System.out.println(plant.ID);

        // Won't work --- type is private
        // System.out.println(plant.type);
        System.out.println(plant.size);
        System.out.println(plant.height);
        System.out.println(oak.size);
        System.out.println(oak.height);
    }
}
