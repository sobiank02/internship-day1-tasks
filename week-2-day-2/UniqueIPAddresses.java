import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueIPAddresses {

    public static void main(String[] args) {

        // Store login attempts
        List<String> ipAddresses = new ArrayList<>();

        ipAddresses.add("192.168.1.1");
        ipAddresses.add("192.168.1.2");
        ipAddresses.add("192.168.1.3");
        ipAddresses.add("192.168.1.1");
        ipAddresses.add("192.168.1.4");
        ipAddresses.add("192.168.1.2");
        ipAddresses.add("192.168.1.5");
        ipAddresses.add("192.168.1.3");
        ipAddresses.add("192.168.1.6");
        ipAddresses.add("192.168.1.1");

        // Display before removing duplicates
        System.out.println("IP Addresses Before Removing Duplicates:");
        System.out.println(ipAddresses);

        // Remove duplicates using HashSet
        Set<String> uniqueIPs = new HashSet<>(ipAddresses);

        // Display after removing duplicates
        System.out.println("\nUnique IP Addresses:");
        System.out.println(uniqueIPs);
    }
}