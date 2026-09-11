package collections;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {

    public static void main(String[] args) {

        Queue<String> printJobs = new LinkedList<>();

        printJobs.add("Assignment.pdf");
        printJobs.add("Resume.docx");
        printJobs.add("ProjectReport.pdf");
        printJobs.add("Notes.docx");

        System.out.println("Print Queue:");

        while (!printJobs.isEmpty()) {
            String job = printJobs.poll();
            System.out.println("Printing: " + job);
        }
    }
}