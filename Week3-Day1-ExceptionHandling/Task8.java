public class Task8 {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division not allowed");

        } finally {
            System.out.println("Program Ended Safely");
        }
    }
}