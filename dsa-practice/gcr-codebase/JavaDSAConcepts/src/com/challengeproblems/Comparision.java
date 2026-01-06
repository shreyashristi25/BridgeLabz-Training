package com.challengeproblems;
import java.io.*;
import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        // Comparing StringBuilder and StringBuffer for concatenation of strings
        System.out.print("Enter the text to concatenate: ");
        String text = sc.nextLine();

        System.out.print("Enter number of iterations: ");
        int iterations = sc.nextInt();
        sc.nextLine(); 

        // StringBuilder
        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endSB = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endSB - startSB) + " ms");

        // StringBuffer
        long startSBuf = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }

        long endSBuf = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endSBuf - startSBuf) + " ms");

        // Comparing FileReader and InputStreamReader 
        System.out.print("Enter the file path to read: ");
        String filePath = sc.nextLine();

        // FileReader
        int wordsFR = 0;
        long startFR = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordsFR += line.trim().split("\\s+").length;
            }
        }
        long endFR = System.currentTimeMillis();
        System.out.println("FileReader word count: " + wordsFR);
        System.out.println("FileReader time: " + (endFR - startFR) + " ms");

        // InputStreamReader
        int wordsISR = 0;
        long startISR = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordsISR += line.trim().split("\\s+").length;
            }
        }

        long endISR = System.currentTimeMillis();
        System.out.println("InputStreamReader word count: " + wordsISR);
        System.out.println("InputStreamReader time: " + (endISR - startISR) + " ms");

        sc.close();
    }

}
