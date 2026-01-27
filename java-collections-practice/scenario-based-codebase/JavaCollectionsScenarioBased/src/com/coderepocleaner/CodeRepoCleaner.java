package com.coderepocleaner;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

	private List<Path> allJavaFiles = new ArrayList<>();
    private Map<String, List<File>> categorizedFiles = new HashMap<>();
    private Set<String> uniqueImports = new HashSet<>();

    // method to Scan the given root directory and collects all .java files

    public void scanFiles(String rootDir) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(rootDir))) {
            allJavaFiles = paths
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());
        }
    }
    
  // method to Analyze each Java file for bad method naming and import statements, then categorizes them

    public void analyzeFiles() {
        Pattern badMethodPattern = Pattern.compile("(public|private|protected)?\\s+(static\\s+)?[a-zA-Z0-9<>]+\\s+[A-Z][a-zA-Z0-9]*\\s*\\(");
        Pattern importPattern = Pattern.compile("import\\s+([a-zA-Z0-9_.]+);");

        for (Path path : allJavaFiles) {
            boolean hasError = false;
            boolean hasWarning = false;

            try {
                List<String> lines = Files.readAllLines(path);
                for (String line : lines) {
                    if (badMethodPattern.matcher(line).find()) {
                        hasError = true;
                    }
                    Matcher imp = importPattern.matcher(line);
                    if (imp.find()) {
                        uniqueImports.add(imp.group(1));
                        // Later: check if unused
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            String type = hasError ? "ERROR" : (hasWarning ? "WARNING" : "VALID");
            categorizedFiles.computeIfAbsent(type, k -> new ArrayList<>()).add(path.toFile());
        }
    }

    //method to filter Java files based on size and last modified timestamp, then prints them and print summary
    public void filterFiles(long minSize, long maxSize, long modifiedAfter) {
        System.out.println("\nFiltered Files:");
        allJavaFiles.stream()
            .map(Path::toFile)
            .filter(f -> f.length() >= minSize && f.length() <= maxSize)
            .filter(f -> f.lastModified() >= modifiedAfter)
            .forEach(f -> System.out.println(f.getName() + " (" + f.length() + " bytes)"));
    }

    public void printSummary() {
        System.out.println("\nSummary:");
        categorizedFiles.forEach((type, files) -> {
            System.out.println(type + " → " + files.size() + " files");
        });
        System.out.println("Unique imports found: " + uniqueImports.size());
    }

}
