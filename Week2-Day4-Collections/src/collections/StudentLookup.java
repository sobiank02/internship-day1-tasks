package collections;

import java.util.HashMap;

public class StudentLookup {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sobia");
        students.put(102, "Afiya");
        students.put(103, "Umama");
        students.put(104, "Roman");

        int rollNumber = 103;

        System.out.println("Student Name for Roll Number " + rollNumber + ": "
                + students.get(rollNumber));
    }
}