package collections;

import java.util.HashSet;

public class ExamSubmissions {

    public static void main(String[] args) {

        HashSet<String> submissions = new HashSet<>();

        submissions.add("Student101");
        submissions.add("Student102");
        submissions.add("Student103");
        submissions.add("Student101");
        submissions.add("Student102");

        System.out.println("Unique Exam Submissions:");

        for (String student : submissions) {
            System.out.println(student);
        }
    }
}
