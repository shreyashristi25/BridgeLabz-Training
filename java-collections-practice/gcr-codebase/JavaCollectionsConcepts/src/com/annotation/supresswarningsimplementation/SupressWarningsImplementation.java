package com.annotation.supresswarningsimplementation;
import java.util.* ;

public class SupressWarningsImplementation {

	@SuppressWarnings("unchecked") 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		ArrayList list = new ArrayList() ;
		
		//getting user input for name, age and marks
		System.out.println("Enter your name : ") ;
		String name = sc.nextLine();
		list.add(name);
		
		System.out.println("Enter your age  : " ) ;
		int age = Integer.parseInt(sc.nextLine().trim()) ;
		list.add(age) ;

		System.out.print("Enter your marks: ");
        double marks = Double.parseDouble(sc.nextLine().trim());
        list.add(marks);

        //displaying result
        System.out.println("Stored values in raw ArrayList:");
        for (Object obj : list) {
            System.out.println(obj);
        }

	}

}
