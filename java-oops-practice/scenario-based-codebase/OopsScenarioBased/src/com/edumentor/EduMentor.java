package com.edumentor;
import java.util.* ;

//driver class for other classes in Edu mentor
public class EduMentor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking instructor info and creating object of instructor class
		System.out.println("Enter the name of Instructor :") ;
		String Iname = sc.nextLine();
		
		System.out.println("Enter the email id of Instructor :") ;
		String mail = sc.nextLine();
		
		System.out.println("Enter instructor's InstructorID") ;
		String instid = sc.nextLine();
		
        Instructor inst = new Instructor(Iname, mail, instid);

        // Taking input for learner and creating object of Learner class  
        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();
      
        System.out.print("Enter Learner Email: ");
        String email = sc.nextLine();
        
        System.out.print("Enter Learner ID: ");
        String id = sc.nextLine();

        Learner learner = new Learner(name, email, id);

        int choice;
        Quiz quiz = null;
        Course course = null;
        
        //taking user input for their choice  and displaying result accordingly
        do {
            System.out.println("--- EduMentor Menu ---");
            System.out.println("1. Create Quiz");
            System.out.println("2. Attempt Quiz");
            System.out.println("3. View Progress");
            System.out.println("4. Assign Certificate");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice) {
                case 1:
                    System.out.print("Choose Quiz Difficulty (1=Easy, 2=Hard): ");
                    int diff = sc.nextInt();
                    sc.nextLine();
                    
                    quiz = inst.createQuiz(diff);
                    System.out.println("Quiz created!");
                    break;
                case 2:
                    if (quiz == null) {
                        System.out.println("No quiz created yet!");
                        break;
                    }
                    
                    learner.attemptQuiz(quiz);
                    System.out.println("Quiz attempted!");
                    break;

                case 3:
                    learner.viewProgress();
                    break;

                case 4:
                    System.out.print("Enter Course Duration (short/full-time): ");
                    String duration = sc.nextLine();
                    
                    System.out.println("Enter Course id : ") ;
                    String courseId =  sc.nextLine();
                    
                    System.out.println("Enter Course name : ") ;
                    String courseName =  sc.nextLine();
                    
                    System.out.println("Enter Course duration : ") ;
                    String  courseDuration =  sc.next();
                    
                    System.out.println("Enter course difficulty :") ;
                    int courseDiff = sc.nextInt();
                    
                    course = new Course(courseId, courseName, courseDuration, courseDiff);
                    course.assignCertificate(learner);
                    break;

                case 5:
                    System.out.println("Exiting EduMentor. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);

        sc.close();
    }


}


