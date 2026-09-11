package collections;

import java.util.TreeMap;

public class Leaderboard {

    public static void main(String[] args) {

        TreeMap<Integer, String> leaderboard = new TreeMap<>();

        leaderboard.put(850, "Sobia");
        leaderboard.put(920, "Afiya");
        leaderboard.put(780, "Umama");
        leaderboard.put(950, "Roman");

        System.out.println("Leaderboard Scores:");

        for (Integer score : leaderboard.keySet()) {
            System.out.println(score + " - " + leaderboard.get(score));
        }
    }
}
