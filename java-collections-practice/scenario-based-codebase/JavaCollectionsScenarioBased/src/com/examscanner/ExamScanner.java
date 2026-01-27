package com.examscanner;
import java.io.* ;
import java.util.* ;

public class ExamScanner {

	private List<String> answerKey;

	//constructor
    public ExamScanner(List<String> answerKey) {
        this.answerKey = answerKey;
    }

    //methods to evaluate answer sheet and validate using regex
    public int evaluate(AnswerSheet<String> sheet) {
        int score = 0;
        List<String> studentAnswers = sheet.getAnswers();
        for (int i = 0; i < answerKey.size() && i < studentAnswers.size(); i++) {
            if (answerKey.get(i).equals(studentAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }

    public static boolean isValidLine(String line) {
        String pattern = "^[A-Za-z ]+(,([A-D]))+$";
        return line.matches(pattern);
    }

}
