package com.fittrack;
import java.util.* ;

//driver class for all other classes in FitTrack
public class FitTrack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		// Create user profile by taking user input
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.print("Enter fitness goal: ");
        String goal = sc.nextLine();
        
        System.out.print("Enter daily calorie target: ");
        double target = sc.nextDouble();

        UserProfile user = new UserProfile(name, age, weight, goal, target);
        user.showProfile();

        double totalCaloriesBurned = 0;
        int choice;

        // Fixed-size array for workouts
        Workout [] workouts = new Workout[5];
        int workoutCount = 0;

        do {
            System.out.println("--- FitTrack Menu ---");
            System.out.println("1. Log Cardio Workout");
            System.out.println("2. Log Strength Workout");
            System.out.println("3. View Progress");
            System.out.println("4. View Workout Logs");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter duration (minutes): ");
                    int cardioDur = sc.nextInt();
                    
                    Workout cardio = new CardioWorkout(cardioDur);
                    cardio.startWorkout();
                    cardio.calculateCalories();
                    cardio.stopWorkout();
                    totalCaloriesBurned += cardio.getCaloriesBurned();
                    
                    if (workoutCount < workouts.length)  {
                    	workouts[workoutCount++] = cardio;
                    }
                    System.out.println("Calories burned: " + cardio.getCaloriesBurned());
                    break;

                case 2:
                    System.out.print("Enter duration (minutes): ");
                    int strengthDur = sc.nextInt();
                    
                    Workout strength = new StrengthWorkout(strengthDur);
                    strength.startWorkout();
                    strength.calculateCalories();
                    strength.stopWorkout();
                    totalCaloriesBurned += strength.getCaloriesBurned();
                    
                    if (workoutCount < workouts.length) {
                    	workouts[workoutCount++] = strength;
                    }
                    System.out.println("Calories burned: " + strength.getCaloriesBurned());
                    break;

                case 3:
                    double remaining = user.computeProgress(totalCaloriesBurned);
                    System.out.println("Total Calories Burned: " + totalCaloriesBurned);
                    System.out.println("Remaining Target: " + remaining);
                    break;

                case 4:
                    System.out.println("--- All Workout Logs ---");
                    for (int i = 0; i < workoutCount; i++) {
                        workouts[i].showLogs();
                    }
                    break;

                case 5:
                    System.out.println("Exiting FitTrack. Stay healthy!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);

        sc.close();



	}

}
