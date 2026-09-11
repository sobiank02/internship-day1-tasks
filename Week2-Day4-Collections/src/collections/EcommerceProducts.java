package collections;

import java.util.HashMap;

public class EcommerceProducts {

    public static void main(String[] args) {

        HashMap<Integer, String> products = new HashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Smartphone");
        products.put(103, "Headphones");
        products.put(104, "Keyboard");

        System.out.println("E-Commerce Products:");

        for (Integer productId : products.keySet()) {
            System.out.println(productId + " - " + products.get(productId));
        }
    }
}