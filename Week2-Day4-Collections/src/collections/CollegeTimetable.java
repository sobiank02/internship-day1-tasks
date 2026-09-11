package collections;

import java.time.LocalTime;
import java.util.TreeMap;

public class CollegeTimetable {

    public static void main(String[] args) {

        TreeMap<LocalTime, String> timetable = new TreeMap<>();

        timetable.put(LocalTime.of(11, 0), "Data Structures");
        timetable.put(LocalTime.of(9, 0), "Java Programming");
        timetable.put(LocalTime.of(14, 0), "Database Management");
        timetable.put(LocalTime.of(10, 0), "Computer Networks");

        System.out.println("College Timetable:");

        for (LocalTime time : timetable.keySet()) {
            System.out.println(time + " - " + timetable.get(time));
        }
    }
}