public class Task4 {

    public static void main(String[] args) {

        String str = null;

        try {
            String temp = str;
            System.out.println(temp.length());
        } catch (NullPointerException e) {
            System.out.println("Null value cannot be accessed");
        }
    }
}