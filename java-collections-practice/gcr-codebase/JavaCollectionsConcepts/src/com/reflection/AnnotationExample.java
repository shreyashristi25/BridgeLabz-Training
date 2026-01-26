package com.reflection;
import java.lang.annotation.* ;
import java.util.* ;

//defining annotation 
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

//applying annotation and retrieving it
@Author(name = "Default Author")

public class AnnotationExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Taking author name from user
        System.out.print("Enter author name: ");
        String userAuthor = sc.nextLine().trim();

        Class<AnnotationExample> cls = AnnotationExample.class;

        // Checking if @Author annotation is present and displaying both values
        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
           
            if (userAuthor.isEmpty()) {
                
                System.out.println("Author (from annotation): " + author.name());
            } 
            else if (userAuthor.matches("\\d+")) {
              
                System.out.println("You entered a number, not a name: " + userAuthor);
            }
            else {
               
                System.out.println("Author (from user input): " + userAuthor);
            }

        } 
        else {
            System.out.println("No @Author annotation found.");
        }


	}

}
