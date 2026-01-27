package com.examscanner;
import java.io.* ;
import java.util.* ;

public class ExamScannerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input and displaying result accordingly
		System.out.print("Enter the path to the answers file (e.g., answers.csv): ");
        String filePath = sc.nextLine();

        List<String> answerKey = Arrays.asList("A","B","C","D","A","B","C");

        ExamScanner scanner = new ExamScanner(answerKey);
        ResultManager manager = new ResultManager();

        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!ExamScanner.isValidLine(line)) {
                    System.out.println("Invalid format: " + line);
                    continue;
                }

                String[] tokens = line.split(",");
                String studentName = tokens[0];
                List<String> answers = Arrays.asList(Arrays.copyOfRange(tokens, 1, tokens.length));

                AnswerSheet<String> sheet = new ScienceAnswerSheet(studentName, answers);
                int score = scanner.evaluate(sheet);
                manager.addResult(studentName, score);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        manager.prepareRanking();
        manager.printRanking();

	}

}
