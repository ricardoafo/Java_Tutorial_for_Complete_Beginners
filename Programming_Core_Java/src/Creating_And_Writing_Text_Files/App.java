package Creating_And_Writing_Text_Files;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("test2.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line one");
            br.newLine();
            br.write("This is line one");
            br.newLine();
            br.write("Last line");
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
    }
}
