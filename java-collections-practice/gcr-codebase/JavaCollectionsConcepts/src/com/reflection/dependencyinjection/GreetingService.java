package com.reflection.dependencyinjection;
import java.lang.annotation.*;
import java.lang.reflect.* ;
import java.util.* ;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

public class GreetingService {

	//method to greet
	public void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to DI demo.");
    }

}
