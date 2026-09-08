package oop;

public class TestOOP {

    public static void main(String[] args) {

        // Student object
        Student student = new Student(
                1, "Sobia", 21, "Computer Science");

        student.study();
        student.attendClass();
        student.displayInfo();

        System.out.println();

        // Employee object
        Employee employee = new Employee(
                101, "Ahmed", "IT", 50000);

        employee.work();
        employee.attendMeeting();
        employee.displayInfo();

        System.out.println();

        // BankAccount object
        BankAccount account = new BankAccount(
                1001, "Sobia", 5000, "Savings");

        account.deposit(2000);
        account.withdraw(1000);
        account.checkBalance();

        System.out.println(account);
    }
}