package com.onlineexamreview;
import java.util.* ;

public class ExamProctor {

	private Stack<Integer> navigationStack;
    private HashMap<Integer, String> studentAnswers;
    private HashMap<Integer, String> correctAnswers;

    //constructor
    public ExamProctor(HashMap<Integer, String> correctAnswers) {
        this.navigationStack = new Stack<>();
        this.studentAnswers = new HashMap<>();
        this.correctAnswers = correctAnswers;
    }

    // method to track visit questions, store answers, calculate store
    public void visitQuestion(int questionID) {
        navigationStack.push(questionID);
        System.out.println("Visited Question: " + questionID);
    }

    public void submitAnswer(int questionID, String answer) {
        studentAnswers.put(questionID, answer);
        System.out.println("Answer submitted for Q" + questionID + ": " + answer);
    }

    public int calculateScore() {
        int score = 0;
        for (Map.Entry<Integer, String> entry : studentAnswers.entrySet()) {
            int qID = entry.getKey();
            String ans = entry.getValue();
            if (correctAnswers.containsKey(qID) && correctAnswers.get(qID).equals(ans)) {
                score++;
            }
        }
        return score;
    }

    //method to get last visited question
    public int getLastVisitedQuestion() {
        return navigationStack.isEmpty() ? -1 : navigationStack.peek();
    }

}
