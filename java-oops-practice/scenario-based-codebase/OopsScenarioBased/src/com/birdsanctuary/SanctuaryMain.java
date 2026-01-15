package com.birdsanctuary;
import java.util.* ;

//driver class for all other classes in Bird Sanctuary
public class SanctuaryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BirdSanctuary sanctuary = new BirdSanctuary();

        //taking user input , calling methods and displaying result accordingly
        while(true) {
            System.out.println("Welcome to EcoWing Wildlife Conservation Center");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            //calling methods based on user choice
            switch(choice) {
                case 1:
                    System.out.println("Enter Bird Type (Eagle/Duck/Penguin/Kiwi): ");
                    String type = sc.nextLine();
                    System.out.println("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();

                    Bird bird = null;
                    switch(type.toLowerCase()) {
                        case "eagle": bird = new Eagle(id, name); break;
                        case "duck": bird = new Duck(id, name); break;
                        case "penguin": bird = new Penguin(id, name); break;
                        case "kiwi": bird = new Kiwi(id, name); break;
                        default: System.out.println("Invalid type!"); continue;
                    }
                    sanctuary.addBird(bird);
                    break;
                case 2: 
                	sanctuary.displayAllBirds(); 
                	break;
                case 3: 
                	sanctuary.displayFlyingBirds(); 
                	break;
                case 4: 
                	sanctuary.displaySwimmingBirds(); 
                	break;
                case 5: 
                	sanctuary.displayBoth(); 
                	break;
                case 6:
                    System.out.println("Enter ID to delete: ");
                    String delId = sc.nextLine();
                    sanctuary.removeBirdById(delId);
                    break;
                case 7: 
                	sanctuary.sanctuaryReport(); 
                	break;
                case 8: 
                	return ;
            }
        }

	}

}
