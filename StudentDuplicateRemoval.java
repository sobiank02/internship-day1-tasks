import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDuplicateRemoval {

    public static void main(String[] args) {

        // Create a List of students
        List<Student> students = new ArrayList<>();

        // Add students including duplicates
        students.add(new Student(101, "Aman", "Computer Science"));
        students.add(new Student(102, "Neha", "Data Science"));
        students.add(new Student(101, "Aman", "Computer Science"));
        students.add(new Student(103, "Rohit", "Computer Science"));
        students.add(new Student(102, "Neha", "Data Science"));

        // Display original List
        System.out.println("Original Student List:");

        for (Student student : students) {
            System.out.println(student);
        }

        // Remove duplicates using HashSet
        Set<Student> uniqueStudents = new HashSet<>(students);

        // Display students after removing duplicates
        System.out.println("\nStudents After Removing Duplicates:");

        for (Student student : uniqueStudents) {
            System.out.println(student);
        }
    }
}