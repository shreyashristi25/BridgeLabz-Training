/* Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/

import java.util.* ;
	public class QuizApp {
		public static void main (String args []) {
			Scanner sc = new Scanner(System.in) ;
			
			//creating a string array questions to store five question for the quiz
			int score = 0 ;
			String [] questions = {"1. Which is the national Bird of India?", "2.What is the national sports of India?", "3. Who is the Prime Minister of India?", "4. Who is known as the iron man of India?", "5. What is the value of 0/0 ?"} ;
			System.out.println("---------Let's play the quiz---------") ;
			
			// Looping through five questions, asking for user's choice, checking for correct answers and calculating the overall scores
			for(int i = 0; i < 5; i++) {
				
				if( i == 0) {
					System.out.println() ;
					System.out.println(questions[i]) ;
					System.out.println("Your options are :") ;
					System.out.println("1. Eagle") ;
					System.out.println("2. Peacock") ;
					System.out.println("3. Crow") ;
					System.out.println("4. Hen") ;
					System.out.println() ;
					System.out.println("Enter your choice :") ;
					int choice = sc.nextInt() ;
				
					switch(choice) {
						case 1:
						case 3:
						case 4:
							System.out.println() ;
							System.out.println("Oops! Wrong Answer") ;
							break ;
						case 2: 
							System.out.println() ;
							System.out.println("Well Done! Right Answer") ;
							score++ ;
							break ;
						default:
							System.out.println() ;
							System.out.println("Invalid input! Please choose from the above options") ;
					}
				}
				else if (i == 1) {
					System.out.println() ;
					System.out.println(questions[i]) ;
					System.out.println("Your options are :") ;
					System.out.println("1. Cricket") ;
					System.out.println("2. Hockey") ;
					System.out.println("3. Football") ;
					System.out.println("4. None of these") ;
					System.out.println() ;
					System.out.println("Enter your choice :") ;
					int choice = sc.nextInt() ;
				
					switch(choice) {
						case 1:
						case 2:
						case 3:
							System.out.println() ;
							System.out.println("Oops! Wrong Answer") ;
							break ;
						case 4: 
							System.out.println() ;
							System.out.println("Well Done! Right Answer") ;
							score ++ ;
							break ;
						default:
							System.out.println() ;
							System.out.println("Invalid input! Please choose from the above options") ;
					
					}
				}
				else if (i == 2) {
					System.out.println() ;
					System.out.println(questions[i]) ;
					System.out.println("Your options are :") ;
					System.out.println("1. Amit Shah") ;
					System.out.println("2. S. Jaishankar") ;
					System.out.println("3. Narendra Modi") ;
					System.out.println("4. Rajnath Singh") ;
					System.out.println() ;
					System.out.println("Enter your choice :") ;
					int choice = sc.nextInt() ;
				
					switch(choice) {
						case 1:
						case 2:
						case 4:
							System.out.println() ;
							System.out.println("Oops! Wrong Answer") ;
							break ;
						case 3: 
							System.out.println() ;
							System.out.println("Well Done! Right Answer") ;
							score ++ ;
							break ;
						default:
							System.out.println() ;
							System.out.println("Invalid input! Please choose from the above options") ;
						
					}
				}
				else if (i == 3) {
					System.out.println() ;
					System.out.println(questions[i]) ;
					System.out.println("Your options are :") ;
					System.out.println("1. Sardar Vallabhbhai Patel") ;
					System.out.println("2. S. Jaishankar") ;
					System.out.println("3. Narendra Modi") ;
					System.out.println("4. Mahatma Gandhi") ;
					System.out.println() ;
					System.out.println("Enter your choice :") ;
					int choice = sc.nextInt() ;
				
					switch(choice) {
						case 2:
						case 3:
						case 4:
							System.out.println() ;
							System.out.println("Oops! Wrong Answer") ;
							break ;
						case 1: 
							System.out.println() ;
							System.out.println("Well Done! Right Answer") ;
							score ++ ;
							break ;
						default:
							System.out.println() ;
							System.out.println("Invalid input! Please choose from the above options") ;
						
					}
				}
				else if (i == 4) {
					System.out.println() ;
					System.out.println(questions[i]) ;
					System.out.println("Your options are :") ;
					System.out.println("1. 0") ;
					System.out.println("2. 1") ;
					System.out.println("3. undefined") ;
					System.out.println("4. 2") ;
					System.out.println() ;
					System.out.println("Enter your choice :") ;
					int choice = sc.nextInt() ;
				
					switch(choice) {
						case 1:
						case 2:
						case 4:
							System.out.println() ;
							System.out.println("Oops! Wrong Answer") ;
							break ;
						case 3: 
							System.out.println() ;
							System.out.println("Well Done! Right Answer") ;
							score ++ ;
							break ;
						default:
							System.out.println() ;
							System.out.println("Invalid input! Please choose from the above options") ;
					
					}
				}
				
				
			}
			
			// Displaying the score and performance 
			System.out.println() ;
			System.out.println("Well Done! You have completed the quiz successfully") ;
			System.out.println() ;
			System.out.println("Your score is : " +score) ;
			if(score >= 4 ) {
				System.out.println("Outstanding Performance!") ;
			}
			else if(score == 3) {
				System.out.println("Good Job!") ;
			}
			else {
				System.out.println("Nice Try! Can Improve.") ;
			}
		}
}