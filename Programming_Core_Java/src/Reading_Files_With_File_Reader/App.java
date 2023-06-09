package Reading_Files_With_File_Reader;

import java.io.*;

public class App {

    public static void main(String[] args) {

        File file = new File("text.txt");
        try  {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            };
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
