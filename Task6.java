public class Task6 {

    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.charAt(0));

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");

        } catch (Exception e) {
            System.out.println("Exception Occurred");
        }
    }
}