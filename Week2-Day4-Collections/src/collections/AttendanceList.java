package collections;

import java.util.LinkedHashSet;

public class AttendanceList {

    public static void main(String[] args) {

        LinkedHashSet<String> attendance = new LinkedHashSet<>();

        attendance.add("Sobia");
        attendance.add("Afiya");
        attendance.add("Umama");
        attendance.add("Roman");
        attendance.add("Sobia");

        System.out.println("Attendance List:");

        for (String student : attendance) {
            System.out.println(student);
        }
    }
}