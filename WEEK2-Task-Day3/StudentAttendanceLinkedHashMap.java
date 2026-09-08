import java.util.*;

public class StudentAttendanceLinkedHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, String> attendance =
                new LinkedHashMap<>();

        System.out.println("Enter 5 students:");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            if (attendance.containsKey(rollNo)) {

                System.out.println(
                    "Roll number already exists. Student ignored."
                );

            } else {

                attendance.put(rollNo, name);
            }
        }

        System.out.println("\nAttendance List:");

        for (Map.Entry<Integer, String> entry :
                attendance.entrySet()) {

            System.out.println(
                "Roll No: " + entry.getKey()
                + " | Name: " + entry.getValue()
            );
        }

        // Search student
        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (attendance.containsKey(searchRoll)) {

            System.out.println(
                "Student Name: " + attendance.get(searchRoll)
            );

        } else {

            System.out.println("Student not found.");
        }

        sc.close();
    }
}