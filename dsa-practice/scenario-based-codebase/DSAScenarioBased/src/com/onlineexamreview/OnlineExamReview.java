package com.onlineexamreview;
import java.util.* ;

public class OnlineExamReview {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Correct answers
        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");

        //creating object of ExamProctor, calling methods and displaying result accordingly
        ExamProctor exam = new ExamProctor(correctAnswers);

        int choice;
        do {
            System.out.println("--- Exam Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. View Last Visited Question");
            System.out.println("4. Submit Exam (Calculate Score)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID: ");
                    int qID = sc.nextInt();
                    exam.visitQuestion(qID);
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int qIDAns = sc.nextInt();
                    System.out.print("Enter Answer: ");
                    String ans = sc.next();
                    exam.submitAnswer(qIDAns, ans);
                    break;

                case 3:
                    int lastQ = exam.getLastVisitedQuestion();
                    if (lastQ == -1)
                        System.out.println("No questions visited yet.");
                    else
                        System.out.println("Last visited question: " + lastQ);
                    break;

                case 4:
                    int score = exam.calculateScore();
                    System.out.println("Final Score: " + score + "/" + correctAnswers.size());
                    break;

                case 5:
                    System.out.println("Exiting Exam System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

}
