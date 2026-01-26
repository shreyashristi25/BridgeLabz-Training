package com.reflection.dependencyinjection;

public class Client {

	 	@Inject
	    private GreetingService greetingService;

	 	//method to run greet method
	    public void run(String userName) {
	        greetingService.greet(userName);
	    }

}
