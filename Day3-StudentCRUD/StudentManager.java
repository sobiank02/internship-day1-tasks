import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> list = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        list.add(s);
    }

    // Display All Students
    public void showStudents() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // Search Student by ID
    public void searchStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update Student
    public void updateStudent(int id, String name, String course) {
        for (Student s : list) {
            if (s.getId() == id) {
                s.setName(name);
                s.setCourse(course);
                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                list.remove(s);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}