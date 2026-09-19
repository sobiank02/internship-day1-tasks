import java.io.FileReader;
import java.io.FileNotFoundException;

public class Task5 {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("abc.txt");
            System.out.println("File opened successfully");
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}