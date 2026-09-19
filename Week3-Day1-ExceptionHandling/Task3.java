public class Task3 {

    public static void main(String[] args) {

        String str = "ABC";

        try {
            int number = Integer.parseInt(str);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Format");
        }
    }
}