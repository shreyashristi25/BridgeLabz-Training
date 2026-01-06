package com.edumentor;
import java.util.* ;

public class Quiz {

	private String [] questions;
    private String [] answers; 
    private int score;

    // Constructor with difficulty
    public Quiz(int difficultyLevel) {
        if (difficultyLevel == 1) {
            questions = new String[]{"2+2?", "Capital of India?"};
            answers = new String[]{"4", "Delhi"};
        } else {
            questions = new String[]{"Square root of 144?", "Largest planet?"};
            answers = new String[]{"12", "Jupiter"};
        }
        score = 0;
    }

    //method to conduct quiz
    public double conductQuiz() {
        Scanner sc = new Scanner(System.in);
        String [] userAnswers = new String[questions.length];

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i+1) + ": " + questions[i]);
            System.out.print("Your Answer: ");
            userAnswers[i] = sc.nextLine();

            // After answering, asking if user wants to go next
            if (i < questions.length - 1) {
                System.out.print("Press Enter to go to next question...");
                sc.nextLine();
            }
        }

        //evaluating score for correct answers
        int correct = 0;
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(answers[i])) {
                correct++;
            }
        }
        
        score = correct;
        
        double percentage = ((double) correct / answers.length) * 100;
        System.out.println("You scored: " + correct + "/" + answers.length);
        System.out.println("Percentage: " + percentage + "%");
        return percentage;

    }
}



