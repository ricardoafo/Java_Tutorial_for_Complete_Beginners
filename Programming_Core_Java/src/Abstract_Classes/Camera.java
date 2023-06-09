package Abstract_Classes;

public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("Starting camera");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff in camera");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown camera");
    }
}
