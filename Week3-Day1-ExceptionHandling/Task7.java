class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Task7 {

    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible");
            }

            System.out.println("You are eligible");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}