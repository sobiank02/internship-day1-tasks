class InvalidLoginException extends Exception {

    public InvalidLoginException(String message) {
        super(message);
    }
}

public class Task10 {

    public static void main(String[] args) {

        String username = "admin";
        String password = "123";

        try {
            if (!username.equals("admin") || !password.equals("123")) {
                throw new InvalidLoginException("Invalid Login");
            }

            System.out.println("Login Successful");

        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}