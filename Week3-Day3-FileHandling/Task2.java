import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("sample.txt");

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}