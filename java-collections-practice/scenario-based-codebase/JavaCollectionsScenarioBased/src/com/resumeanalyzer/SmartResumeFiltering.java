package com.resumeanalyzer;
import java.io.* ;
import java.util.regex.* ;
import java.nio.file.* ;
import java.util.* ;

public class SmartResumeFiltering {

	private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
	private static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{10}\\b");
	private List<String> keywords ;
	private Map<String , ResumeData> resumeMap = new HashMap<>() ;
	
	//constructor
	public SmartResumeFiltering(List<String> keywords) {
		this.keywords = keywords ;
	}
	
	//method to process resume files 
	public void processResumes(String folderPath) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folderPath))) {
            for (Path file : stream) {
                try {
                    String content = readFile(file);
                    String email = extractDetail(content, EMAIL_PATTERN);
                    String phone = extractDetail(content, PHONE_PATTERN);

                    if (email == null || phone == null) {
                        throw new IllegalArgumentException("Invalid resume format");
                    }

                    int keywordCount = countKeywords(content);
                    ResumeData data = new ResumeData(email, phone, keywordCount);
                    resumeMap.put(email, data);

                } catch (Exception e) {
                    System.out.println("Skipping invalid resume: " + file.getFileName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	//methods to read  file, extract details from the file and count keywords
    private String readFile(Path file) throws IOException {
    	return new String(Files.readAllBytes(file));
    }

    private String extractDetail(String content, Pattern pattern) {
    	Matcher matcher = pattern.matcher(content);
    	return matcher.find() ? matcher.group() : null;
    }

    private int countKeywords(String content) {
    	int count = 0;
        for (String keyword : keywords) {
        	Matcher matcher = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE).matcher(content);
            while (matcher.find()) count++;
         }
         return count;
    }

    //methods to sort candidates and search a candidate through emial
    public List<ResumeData> getSortedCandidates() {
    	List<ResumeData> candidates = new ArrayList<>(resumeMap.values());
    	candidates.sort((a, b) -> Integer.compare(b.getKeywords(), a.getKeywords()));
    	return candidates;
    }

    public ResumeData searchByEmail(String email) {	
    	return resumeMap.get(email);
    }

}
