package collections;

import java.util.PriorityQueue;

public class PriorityTasks {

    public static void main(String[] args) {

        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        tasks.add(3); // Low priority
        tasks.add(1); // High priority
        tasks.add(2); // Medium priority
        tasks.add(4); // Lowest priority

        System.out.println("Tasks by Priority:");

        while (!tasks.isEmpty()) {
            System.out.println("Processing task with priority: " + tasks.poll());
        }
    }
}