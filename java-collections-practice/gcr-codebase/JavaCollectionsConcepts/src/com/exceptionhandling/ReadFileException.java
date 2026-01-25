package com.exceptionhandling;
import java.io.* ;
import java.util.*;

public class ReadFileException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking file path as input and handling IOException using try-with-resources
		System.out.println("Enter the file path : ") ;
		String filePath = sc.nextLine() ;
		
		try (
			BufferedReader br = new BufferedReader(new FileReader(filePath)) ) {
			
			String firstLine = br.readLine() ;
			
			if(firstLine != null) {
				System.out.println("First Line : " +firstLine) ;
			}
			else {
				System.out.println("File is empty!") ;
			}
		}
		catch(IOException e) {
			System.out.println("Error reading file..") ;
		}
		sc.close() ;
			
		

	}

}
