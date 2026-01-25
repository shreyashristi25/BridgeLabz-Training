package com.exceptionhandling;
import java.io.* ;
import java.util.* ;

public class FileReaderException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking file path as user input 
		System.out.println("Enter the file path to read file : ");
		String filePath = sc.nextLine() ;
		
		//handling exception if the file is not found
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath)) ;
			String line ;
			
			System.out.println("Contents of " +filePath +" : ") ;
			while( (line = br.readLine() ) != null) {
				System.out.println(line) ;
			}
			
			br.close();
		}
		catch  (IOException e){
			System.out.println("File not found !") ;
		}

		sc.close();
	}

}
