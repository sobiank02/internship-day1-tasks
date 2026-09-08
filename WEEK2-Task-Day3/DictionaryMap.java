import java.util.*;

public class DictionaryMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();

        System.out.println("Enter 5 words and their meanings:");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter word " + i + ": ");
            String word = sc.nextLine();

            System.out.print("Enter meaning: ");
            String meaning = sc.nextLine();

            dictionary.put(word, meaning);
        }

        System.out.println("\nDictionary:");
        System.out.println(dictionary);

        System.out.print("\nEnter a word to search: ");
        String searchWord = sc.nextLine();

        if (dictionary.containsKey(searchWord)) {
            System.out.println("Meaning: " + dictionary.get(searchWord));
        } else {
            System.out.println("Word not found in the dictionary");
        }

        sc.close();
    }
}