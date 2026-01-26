package com.reflection;
import java.lang.reflect.* ;
import java.util.* ;

public class MathematicalOperations {

	//methods to add, subtract and multiply two numbers
	public int add(int a, int b) {
		return a + b ;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Taking method name and numbers from user 
        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Using Reflection to dynamically invoke a MathematicalOperations method chosen by the user and displaying the result
        try {
           
            MathematicalOperations obj = new MathematicalOperations();

            Class<?> cls = obj.getClass();

            Method method = cls.getMethod(methodName, int.class, int.class);

            Object result = method.invoke(obj, num1, num2);

            System.out.println("Result: " + result);

        } 
        catch (NoSuchMethodException e) {
            System.out.println("Invalid method name entered!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

