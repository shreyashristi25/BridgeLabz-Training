package com.edumentor;

//creating class Instructor as a subclass of User
public class Instructor extends User {

	//constructor
	public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

	//method to create quiz
    public Quiz createQuiz(int difficultyLevel) {
        return new Quiz(difficultyLevel);
    }

}
