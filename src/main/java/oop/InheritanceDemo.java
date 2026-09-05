package oop;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class StudentPerson extends Person {

    String course;

    StudentPerson(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void study() {
        System.out.println(name + " is studying " + course);
    }
}

class EmployeePerson extends Person {

    String department;

    EmployeePerson(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void work() {
        System.out.println(name + " is working in " + department);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        StudentPerson student =
                new StudentPerson("Sobia", 21, "Computer Science");

        EmployeePerson employee =
                new EmployeePerson("Ahmed", 25, "IT");

        student.displayPerson();
        student.study();

        System.out.println();

        employee.displayPerson();
        employee.work();
    }
}