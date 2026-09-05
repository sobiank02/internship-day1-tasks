package oop;

class PersonPoly {

    void work() {
        System.out.println("Person is working");
    }
}

class StudentPoly extends PersonPoly {

    @Override
    void work() {
        System.out.println("Student is studying");
    }
}

class EmployeePoly extends PersonPoly {

    @Override
    void work() {
        System.out.println("Employee is working");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        PersonPoly person;

        person = new StudentPoly();
        person.work();

        person = new EmployeePoly();
        person.work();
    }
}