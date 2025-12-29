
import java.util.* ;
public class  PhoneRechargeSimulator {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in) ;
		
		double balance = 0.0;
		
		boolean continueRecharging = true;
		double amount = 0.0;

		while (continueRecharging) {

		System.out.println("----Our Mobile Operators----") ;
		System.out.println() ;
		System.out.println("1. Airtel") ;
		System.out.println("2. Jio") ;
		System.out.println("3. Vodafone Idea") ;
		System.out.println("4. BSNL") ;
		System.out.println("Enter your mobile operator :") ;
		int choice = sc.nextInt() ;
		System.out.println() ;
		switch(choice) {
			case 1: 
				System.out.println("Price						Plan") ;
				System.out.println("Popular Combo Plans (28-84 Days)") ;
				System.out.println("1.₹349				2GB/day, Unlimited Calls, 100 SMS, Unlimited 5G, Xstream Play") ;
				System.out.println("2.₹449				3GB/day, Unlimited Calls, SMS, 22+ OTTs, Unlimited 5G") ;
				System.out.println("3.₹979				2GB/day, 84 Days, Unlimited Calls, Xstream Play") ;
				System.out.println() ;
				System.out.println("Long Validity Plans (365 Days)") ;
				System.out.println("4.₹3599				2GB/day, Unlimited Calls, Full-year OTT access") ;
				System.out.println("5.₹3999				2.5GB/day, Unlimited Calls, Year-long OTT bundle") ;
				System.out.println() ;
				System.out.print("Choose a plan: ");
                    int airtelPlan = sc.nextInt();
                    switch (airtelPlan) {
                        case 1: amount = 349; break;
                        case 2: amount = 449; break;
                        case 3: amount = 979; break;
						case 4: amount = 3599; break;
						case 5: amount = 3999; break;
                        default: System.out.println("Invalid Airtel plan!"); break;
                    }
                    break;
			
			case 2:
				System.out.println("Price						Plan") ;
				System.out.println("Popular Combo Plans (28-84 Days)") ;
				System.out.println("1.₹299				1.5GB/day, 28 days") ;
				System.out.println("2.₹349				2GB/day, 28 days, True 5G benefits.") ;
				System.out.println() ;
				
				System.out.println("Long Validity Plans (365 Days)") ;
				System.out.println("3.₹3599				Annual plan with digital benefit") ;
				System.out.println("4.₹2399				2GB/day, 365 days") ;
				System.out.println() ;
				System.out.print("Choose a plan: ");
                    int jioPlan = sc.nextInt();

                    switch (jioPlan) {
                        case 1: amount = 299; break;
                        case 2: amount = 349;  break;
                        case 3: amount = 3599; break;
						case 4 : amount = 2399; break;
                        default: System.out.println("Invalid Jio plan!"); break;
                    }
                    break;



			case 3 :
				System.out.println("Price						Plan") ;
				System.out.println("Popular Combo Plans (28-84 Days)") ;
				System.out.println("1.₹299				1.5GB/day, 28 days, Unlimited Calls, 100 SMS") ;
				System.out.println("2.₹349				1.5GB/day, 28 days, Unlimited Calls, Weekend Data Rollover, 5G Data") ;
				System.out.println("3.₹399				2GB/day, 28 days, Unlimited Calls, 12am-12pm Unlimited Data, JioHotstar") ;
				System.out.println("4.₹408				 2GB/day, 28 days, Unlimited Calls, Unlimited 5G Data, SonyLIV") ;
				System.out.println("5.₹979				 2GB/day, 84 days, Unlimited Calls, 12am-12pm Unlimited Data, Multiple OTTs") ;
				System.out.println() ;
				System.out.print("Choose a plan: ");
                    int viPlan = sc.nextInt();

                    switch (viPlan) {
                        case 1: amount = 299; break;
                        case 2: amount = 349; break;
                        case 3: amount = 399; break;
						case 4: amount = 408; break;
						case 5: amount = 979; break;
                        default: System.out.println("Invalid Vi plan!"); break;
                    }
                    break;

			case 4:
				System.out.println("Price						Plan") ;
				System.out.println("Popular Combo Plans (28-84 Days)") ;
				System.out.println("1.₹398				 84 days, Unlimited Calls, 3GB/day data, 100 SMS/day") ;
				System.out.println("2.₹447 				 84 days, Unlimited Calls, 5GB/day data, 100 SMS/day") ;
				System.out.println() ;
				System.out.println("Long Validity Plans (365 Days)") ;
				System.out.println("3.₹1515				365 days, Unlimited Calls, 2GB/day data (730GB total), 100 SMS/day, Free Incoming on Roaming") ;
				System.out.println("4.₹2399				395 days, Unlimited Calls, 2GB/day data, 100 SMS/day, Eros Now, BSNL Tunes. ") ;
				System.out.println() ;
				System.out.print("Choose a plan: ");
                    int bsnlPlan = sc.nextInt();

                    switch (bsnlPlan) {
                        case 1: amount = 398; break;
                        case 2: amount = 447; break;
                        case 3: amount = 1515; break;
                        default: System.out.println("Invalid BSNL plan!"); break;
                    }
                    break;
			default:
                    System.out.println("Invalid operator choice!");
                    continue;
			}
			balance += amount;

            System.out.println("\n------ RECHARGE SUMMARY ------");
            System.out.println("Recharge Amount : ₹" + amount);
            System.out.println("Current Balance : ₹" + balance);
            System.out.println("-------------------------------");

            System.out.print("Do you want to recharge again? (y/n): ");
            String ans = sc.next().trim().toLowerCase();
            continueRecharging = ans.startsWith("y");
        }

        System.out.println("Thank you for using the Phone Recharge Simulator!");
        sc.close();

		
	}
}