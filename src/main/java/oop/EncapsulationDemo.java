package oop;

class EncapsulationPerson {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        EncapsulationPerson person = new EncapsulationPerson();

        person.setName("Sobia");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}