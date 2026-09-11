package collections;

import java.util.LinkedHashMap;

public class Cache {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();

        cache.put(1, "Home Page");
        cache.put(2, "Profile Page");
        cache.put(3, "Products Page");
        cache.put(4, "Settings Page");

        System.out.println("Cache in Insertion Order:");

        for (Integer key : cache.keySet()) {
            System.out.println(key + " - " + cache.get(key));
        }
    }
}