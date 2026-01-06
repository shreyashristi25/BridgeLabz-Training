package com.edumentor;

//creating Learner as a subclass of User and ICertifiable
public class Learner extends User implements ICertifiable{
	
	private double progress;

	//constructor
    public Learner(String name, String email, String userId) {
        super(name, email, userId);
        this.progress = 0.0;
    }

    //methods to attempt quiz and view progress
    public void attemptQuiz(Quiz q) {
        progress += q.conductQuiz();
    }

    public void viewProgress() {
        System.out.println("Progress: " + progress + "%");
    }

    @Override
    public void generateCertificate(String courseType) {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Certificate: Participation in Short Course" );
        } else {
            System.out.println("Certificate: Completion of Full-Time Course with Grade");
        }
    }

}
