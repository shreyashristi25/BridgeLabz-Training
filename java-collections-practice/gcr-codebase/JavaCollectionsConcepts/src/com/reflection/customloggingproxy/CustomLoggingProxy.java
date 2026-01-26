package com.reflection.customloggingproxy;
import java.util.* ;
import java.lang.reflect.*;
public class CustomLoggingProxy {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 //taking user input and displaying result using proxy
		 System.out.print("Enter your name: ");
		 String userName = sc.nextLine().trim();

		 Greeting realGreeting = new GreetingImplementation();

		 Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
				 Greeting.class.getClassLoader(),
	             new Class[]{Greeting.class},
	             new LoggingHandler(realGreeting)
				 );

		 proxyGreeting.sayHello(userName);


	}

}
