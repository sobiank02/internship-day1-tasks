public class Task2 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index Accessed");
        }
    }
}