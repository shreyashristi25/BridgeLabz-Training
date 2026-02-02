package com.streamapi.insuranceclaimanalysis;
import java.util.* ;
import java.util.stream.Collectors;

public class ClaimAnalysis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of claims, claimType and amount as user input 
		List<Claim> claims = new ArrayList<>() ;
		System.out.println("Enter the number of claims : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for(int  i =0; i  <n; i++) {
			System.out.println("Enter Claim Type : ") ;
			String claimType = sc.nextLine() ;
			
			System.out.println("Enter amount : ") ;
			double amount = sc.nextDouble() ;
			sc.nextLine() ;
			
			claims.add(new Claim(claimType, amount)) ;
		}
		
		//finding average claim amount 
		Map<String, Double> avgClaims = claims.stream()
				.collect(Collectors.groupingBy(Claim  :: getClaimType, Collectors.averagingDouble(Claim :: getAmount))) ;
		
		//displaying result
		System.out.println("=== Average Claim Amount by Type ===");
        avgClaims.forEach((type, avg) -> 
            System.out.println(type + " : " + avg));

	}

}
