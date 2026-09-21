import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("sample.txt")
            );

            String line;

            while ((line = reader.readLine()) != null) {

                lines++;

                characters += line.length();

                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    String[] wordList = trimmedLine.split("\\s+");
                    words += wordList.length;
                }
            }

            reader.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}