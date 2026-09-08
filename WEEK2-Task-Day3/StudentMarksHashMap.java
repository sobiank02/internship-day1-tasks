import java.util.*;

public class StudentMarksHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> marks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter marks: ");
            int studentMarks = sc.nextInt();

            marks.put(rollNo, studentMarks);
        }

        System.out.println("\nStudent Marks:");
        System.out.println(marks);

        // Updating marks
        System.out.print("\nEnter roll number to update marks: ");
        int updateRoll = sc.nextInt();

        if (marks.containsKey(updateRoll)) {

            System.out.print("Enter new marks: ");
            int newMarks = sc.nextInt();

            marks.put(updateRoll, newMarks);

            System.out.println("Marks updated successfully.");

        } else {

            System.out.println("Roll number not found.");
        }

        // Searching
        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (marks.containsKey(searchRoll)) {

            System.out.println(
                "Marks: " + marks.get(searchRoll)
            );

        } else {

            System.out.println("Roll number not found.");
        }

        // Print complete HashMap
        System.out.println("\nComplete HashMap:");
        System.out.println(marks);

        sc.close();
    }
}
