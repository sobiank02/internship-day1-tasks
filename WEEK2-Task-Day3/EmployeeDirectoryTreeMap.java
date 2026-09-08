import java.util.*;

public class EmployeeDirectoryTreeMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, String> employees =
                new TreeMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            employees.put(id, name);
        }

        System.out.println("\nEmployee Directory:");

        for (Map.Entry<Integer, String> entry :
                employees.entrySet()) {

            System.out.println(
                "Employee ID: " + entry.getKey()
                + " | Name: " + entry.getValue()
            );
        }

        sc.close();
    }
}