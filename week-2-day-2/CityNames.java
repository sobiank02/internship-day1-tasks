import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CityNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create LinkedHashSet
        Set<String> cities = new LinkedHashSet<>();

        // Take 5 city names from the user
        System.out.println("Enter 5 city names:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter city " + i + ": ");
            String city = sc.nextLine();

            cities.add(city);
        }

        // Display cities without duplicates
        System.out.println("\nCities without duplicates:");
        System.out.println(cities);

        sc.close();
    }
}