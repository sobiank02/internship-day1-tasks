public class Student {

    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        return id == student.id
                && name.equals(student.name)
                && course.equals(student.course);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode() + course.hashCode();
    }

    @Override
    public String toString() {
        return "ID: " + id
                + ", Name: " + name
                + ", Course: " + course;
    }
}