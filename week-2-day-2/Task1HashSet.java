import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1HashSet {

    public static void main(String[] args) {

        // Store values in a List
        List<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Neha");
        names.add("Aman");
        names.add("Rohit");
        names.add("Neha");
        names.add("Sahil");
        names.add("Aman");

        // Display Original List
        System.out.println("Original List:");
        System.out.println(names);

        // Remove duplicates using HashSet
        Set<String> uniqueNames = new HashSet<>(names);

        // Display Set with unique values
        System.out.println("\nSet with Unique Values:");
        System.out.println(uniqueNames);

        // Convert Set back to List
        List<String> uniqueList = new ArrayList<>(uniqueNames);

        System.out.println("\nUnique List:");
        System.out.println(uniqueList);
    }
}