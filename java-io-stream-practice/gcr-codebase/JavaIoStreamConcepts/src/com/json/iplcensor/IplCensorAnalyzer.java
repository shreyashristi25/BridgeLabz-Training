package com.json.iplcensor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.*;
import java.util.*;

public class IplCensorAnalyzer {

	// method to Mask team names and redact player of the match
    private static String maskTeamName(String team) {
        String[] parts = team.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return team;
    }

    private static String redactPlayer(String player) {
        return "REDACTED";
    }

    // method to Process JSON file
    private static void processJson(String inputPath, String outputPath) throws Exception {
        JSONArray matches = new JSONArray(new JSONTokener(new FileInputStream(inputPath)));

        for (int i = 0; i < matches.length(); i++) {
            JSONObject match = matches.getJSONObject(i);

            match.put("team1", maskTeamName(match.getString("team1")));
            match.put("team2", maskTeamName(match.getString("team2")));
            match.put("winner", maskTeamName(match.getString("winner")));
            match.put("player_of_match", redactPlayer(match.getString("player_of_match")));

            JSONObject score = match.getJSONObject("score");
            JSONObject newScore = new JSONObject();
            for (String key : score.keySet()) {
                newScore.put(maskTeamName(key), score.get(key));
            }
            match.put("score", newScore);
        }

        try (FileWriter fw = new FileWriter(outputPath)) {
            fw.write(matches.toString(4));
        }
    }

    //method to Process CSV file without OpenCSV
    private static void processCsv(String inputPath, String outputPath) throws Exception {
        List<String[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(line.split(","));
            }
        }

        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);
            row[1] = maskTeamName(row[1]); 
            row[2] = maskTeamName(row[2]); 
            row[5] = maskTeamName(row[5]); 
            row[6] = redactPlayer(row[6]);
        }

        // Write CSV manually
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (String[] row : rows) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter JSON input file path: ");
            String jsonInput = scanner.nextLine();
            System.out.print("Enter JSON output file path: ");
            String jsonOutput = scanner.nextLine();

            processJson(jsonInput, jsonOutput);
            System.out.println("✅ Censored JSON written to " + jsonOutput);

            System.out.print("Enter CSV input file path: ");
            String csvInput = scanner.nextLine();
            System.out.print("Enter CSV output file path: ");
            String csvOutput = scanner.nextLine();

            processCsv(csvInput, csvOutput);
            System.out.println("Censored CSV written to " + csvOutput);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


    
}
