package Runtime_Vs_Checked_Exceptions;

public class App {
    public static void main(String[] args) {

       /* try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        //int value = 7 / 0;

        /* String text = null;
        System.out.println(text.length()); */

        String[] texts = {"one", "two", "three"};
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}
