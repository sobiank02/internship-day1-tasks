import java.util.Set;
import java.util.TreeSet;

public class ProductPrices {

    public static void main(String[] args) {

        // Create a TreeSet to store product prices
        Set<Double> prices = new TreeSet<>();

        // Add product prices
        prices.add(999.99);
        prices.add(499.50);
        prices.add(1299.00);
        prices.add(750.25);
        prices.add(499.50);
        prices.add(1500.00);

        // Display sorted prices
        System.out.println("Product Prices in Sorted Order:");
        System.out.println(prices);
    }
}