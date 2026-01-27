package com.junit.main.calculator;
import java.util.* ;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Calculator calculator = new Calculator();
        
		//taking user choice as input, performing operations and displaying result accordingly
        System.out.println("=== Simple Calculator ===");
        System.out.println("Choose operation: add/subtract/multiply/divide : ");
        String operation = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            int result = 0;
            switch (operation.toLowerCase()) {
                case "add":
                    result = calculator.add(a, b);
                    break;
                case "subtract":
                    result = calculator.subtract(a, b);
                    break;
                case "multiply":
                    result = calculator.multiply(a, b);
                    break;
                case "divide":
                    result = calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
	}
}


