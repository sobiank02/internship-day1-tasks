import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {

        String longestWord = "";
        String shortestWord = "";
        Set<String> uniqueWords = new HashSet<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("sample.txt")
            );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {

                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    if (!word.isEmpty()) {

                        uniqueWords.add(word);

                        if (longestWord.isEmpty() ||
                                word.length() > longestWord.length()) {
                            longestWord = word;
                        }

                        if (shortestWord.isEmpty() ||
                                word.length() < shortestWord.length()) {
                            shortestWord = word;
                        }
                    }
                }
            }

            reader.close();

            System.out.println("Longest word: " + longestWord);
            System.out.println("Shortest word: " + shortestWord);
            System.out.println("Unique words: " + uniqueWords.size());

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}