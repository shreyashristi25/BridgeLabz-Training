package com.feedbackguru;
import java.io.*;
import java.util.* ;
import java.util.regex.* ;

public class SmartSurveyAnalyzer {

	Map<String, List<Feedback<String>>> categories = new HashMap<>();

	//constructor
    public SmartSurveyAnalyzer() {
        categories.put("Positive", new ArrayList<>());
        categories.put("Neutral", new ArrayList<>());
        categories.put("Negative", new ArrayList<>());
    }

    // Reading feedback file line by line
    void readFile(String filePath, String type) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int rating = extractRating(line);
                    Feedback<String> fb = new Feedback<>(type, line, rating);
                    categorize(fb);
                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

   // Regex to extract rating like "9/10"
    int extractRating(String text) {
        Pattern p = Pattern.compile("(\\d+)/10");
        Matcher m = p.matcher(text);
        if (m.find()) {
            return Integer.parseInt(m.group(1));
        }
        throw new IllegalArgumentException("No rating found");
    }

    // Categorizing feedback based on rating and displaying summary
    void categorize(Feedback<String> fb) {
        if (fb.rating >= 7) categories.get("Positive").add(fb);
        else if (fb.rating >= 4) categories.get("Neutral").add(fb);
        else categories.get("Negative").add(fb);
    }

    void showSummary() {
        for (String cat : categories.keySet()) {
            System.out.println("\n" + cat + " Feedback:");
            for (Feedback<String> fb : categories.get(cat)) {
                System.out.println(" - " + fb);
            }
        }
    }

}
