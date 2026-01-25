package com.exceptionhandling;
import java.util.* ;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		try {
            // Taking user input and handling exception using nested try-catch blocks
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the index to access: ");
            int index = sc.nextInt();

            try {
                
                int element = arr[index];

                System.out.print("Enter the divisor: ");
                int divisor = sc.nextInt();

                try {
                    
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } 
                catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } 
		catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } 
		finally {
            sc.close();
        }
    }
}
