package oop;

interface Printable {

    void printDetails();
}

class StudentPrintable implements Printable {

    @Override
    public void printDetails() {
        System.out.println("Student: Sobia");
        System.out.println("Course: Computer Science");
    }
}

class EmployeePrintable implements Printable {

    @Override
    public void printDetails() {
        System.out.println("Employee: Ahmed");
        System.out.println("Department: IT");
    }
}

public class PrintableDemo {

    public static void main(String[] args) {

        Printable student = new StudentPrintable();
        student.printDetails();

        System.out.println();

        Printable employee = new EmployeePrintable();
        employee.printDetails();
    }
}