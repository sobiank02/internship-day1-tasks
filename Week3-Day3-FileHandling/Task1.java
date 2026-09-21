import java.io.File;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("sample.txt created successfully.");
            } else {
                System.out.println("sample.txt already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}