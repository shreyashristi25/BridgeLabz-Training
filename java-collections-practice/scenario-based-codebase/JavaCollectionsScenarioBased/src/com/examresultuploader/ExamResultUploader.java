package com.examresultuploader;
import java.io.* ;
import java.util.* ;

public class ExamResultUploader {

	private static final String LINE_PATTERN = "^(\\d+),([A-Za-z ]+),([A-Za-z]+),(\\d+)$";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //taking user input for file path, exam type
        System.out.print("Enter path to exam results file (e.g., results.csv): ");
        String filePath = sc.nextLine();

        System.out.print("Enter exam type (MidTerm/Final/Internal): ");
        String examType = sc.nextLine();

        Map<String, List<Integer>> subjectMarks = new HashMap<>();
        Map<String, PriorityQueue<ExamResult<String>>> subjectTopScorers = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                if (!line.matches(LINE_PATTERN)) {
                    throw new InvalidResultFormatException("Invalid line format: " + line);
                }

                String[] tokens = line.split(",");
                String rollNo = tokens[0];
                String name = tokens[1];
                String subject = tokens[2];
                int marks = Integer.parseInt(tokens[3]);

                ExamResult<String> result = new ExamResult<>(rollNo, name, subject, marks, examType);

                subjectMarks.computeIfAbsent(subject, k -> new ArrayList<>()).add(marks);

                subjectTopScorers.computeIfAbsent(subject, k -> new PriorityQueue<>(
                    (a, b) -> b.getMarks() - a.getMarks()
                )).add(result);
            }
        } 
        catch (InvalidResultFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        // Printing subject-wise marks
        System.out.println("--- Subject-wise Marks ---");
        subjectMarks.forEach((subject, marksList) -> {
            System.out.println(subject + " : " + marksList);
        });

        //Printing top scorer per subject
        System.out.println("--- Top Scorers ---");
        subjectTopScorers.forEach((subject, pq) -> {
            ExamResult<String> top = pq.peek();
            System.out.println(subject + " → " + top);
        });


	}

}
