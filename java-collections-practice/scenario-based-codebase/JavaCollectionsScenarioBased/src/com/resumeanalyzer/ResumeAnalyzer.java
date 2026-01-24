package com.resumeanalyzer;
import java.util.* ;
import java.util.regex.* ;
import java.io.* ;
import java.nio.file.* ;

public class ResumeAnalyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking folder path and keywords as user input 
		System.out.println("Enter folder path conatining resumes : ") ;
		String folderPath = sc.nextLine();
		
		System.out.println("Enter keywords (comma seperatec) : ") ;
		String [] kw = sc.nextLine().split(", ") ;
		
		List<String> keywords = new ArrayList<>() ;
		for(String k : kw) {
			keywords.add(k.trim()) ;
		}
		
		SmartResumeFiltering analyzer = new SmartResumeFiltering(keywords) ;
		analyzer.processResumes(folderPath) ;

		//taking user choice as input and displaying results accordingly
		while(true) {
			System.out.println("=====ResumeAnalyzer=====") ;
			System.out.println("1. View Sorted Candidates ") ;
			System.out.println("2. Search Candidate by Email ") ;
			System.out.println("3. Exit" ) ;
			System.out.println("Enter your choice : ") ;
			int choice = sc.nextInt() ;
			sc.nextLine() ;
			
			switch(choice) {
			
				case 1 :
					System.out.println("Sorted Candidates : ") ;
					for(ResumeData data : analyzer.getSortedCandidates() ) {
						System.out.println(data) ;
					}
					break ;
				
				case 2 :
					System.out.println("Enter candidate email : ") ;
					String email = sc.nextLine();
					
					ResumeData result =  analyzer.searchByEmail(email) ;
					
					if(result != null) {
						System.out.println("Candidate Found : " + result) ;
					}
					else {
						System.out.println("No candidates found with the email : " +email ) ;
						
					}
					break ;
					
				case 3 :
					
					System.out.println("Exiting ResumeAnalayzer...........!") ;
					sc.close();
					return ;
				
				default : 
					System.out.println("Invalid choice. Try Again !") ;
			}
		}
	}

}
