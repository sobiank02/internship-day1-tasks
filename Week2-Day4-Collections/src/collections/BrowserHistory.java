package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    public static void main(String[] args) {

        Deque<String> history = new ArrayDeque<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");
        history.push("LinkedIn");

        System.out.println("Browser History:");

        for (String page : history) {
            System.out.println(page);
        }

        System.out.println("\nGoing back to: " + history.pop());
        System.out.println("Current page: " + history.peek());
    }
}