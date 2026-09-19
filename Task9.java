public class Task9 {

    public static int checkMarks(int marks) throws Exception {

        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid marks");
        }

        return marks;
    }

    public static void main(String[] args) {

        int marks = 120;

        try {
            int result = checkMarks(marks);
            System.out.println("Marks: " + result);

        } catch (Exception e) {
            System.out.println("Invalid marks");
        }
    }
}