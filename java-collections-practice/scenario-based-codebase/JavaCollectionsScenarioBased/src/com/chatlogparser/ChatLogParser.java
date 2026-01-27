package com.chatlogparser;
import java.io.* ;
import java.util.* ;
import java.util.regex.* ;

public class ChatLogParser {

	private static final String LOG_PATTERN = "\\[(.*?)\\]\\s(.*?):\\s(.*)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user for file path, idle keywords
        System.out.print("Enter chat log file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter idle keywords (comma separated, e.g. lol,brb,omg): ");
        String[] keywords = sc.nextLine().split(",");
        List<String> idleKeywords = Arrays.asList(keywords);

        MessageFilter<String> filter = new IdleChatFilter(idleKeywords);

        Map<String, List<String>> userMessages = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            Pattern pattern = Pattern.compile(LOG_PATTERN);

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    String timestamp = matcher.group(1);
                    String user = matcher.group(2);
                    String message = matcher.group(3);

                    // Apply filter
                    if (filter.filter(message)) {
                        userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add("[" + timestamp + "] " + message);
                    }
                } else {
                	System.out.println("Invalid log format: " + line);
                }
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Printing results
        System.out.println("--- Chat Messages by User ---");
        for (Map.Entry<String, List<String>> entry : userMessages.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (String msg : entry.getValue()) {
                System.out.println("   " + msg);
            }
        }

    }

}
