package com.examscanner;
import java.io.* ;
import java.util.* ;

public class ResultManager {

	private Map<String, Integer> scores = new HashMap<>();
    private PriorityQueue<Map.Entry<String, Integer>> ranking;

    //constructor
    public ResultManager() {
        ranking = new PriorityQueue<>(
            (a, b) -> b.getValue().compareTo(a.getValue()) // highest score first
        );
    }

    //methods to add result, prepare rank and print ranks
    public void addResult(String studentName, int score) {
        scores.put(studentName, score);
    }

    public void prepareRanking() {
        ranking.addAll(scores.entrySet());
    }

    public void printRanking() {
        System.out.println("\n--- Leaderboard ---");
        while (!ranking.isEmpty()) {
            Map.Entry<String, Integer> entry = ranking.poll();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
