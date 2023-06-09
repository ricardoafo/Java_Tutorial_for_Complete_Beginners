package Try_With_Resources;

class  Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
    }
}

public class App {

    public static void main(String[] args) {
        try(Temp temp = new Temp()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
