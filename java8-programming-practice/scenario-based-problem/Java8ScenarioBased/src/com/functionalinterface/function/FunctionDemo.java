package com.functionalinterface.function;
import java.util.* ;
import java.util.function.*;

public class FunctionDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Convert student marks into grade (A/B/C)
        Function<Integer, String> marksToGrade = marks -> {
            if (marks >= 75) return "A";
            else if (marks >= 50) return "B";
            else return "C";
        };
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();
        System.out.println("Grade: " + marksToGrade.apply(marks));

        // Payroll system: calculate annual salary from monthly salary
        Function<Double, Double> annualSalary = monthly -> monthly * 12;
        System.out.print("\nEnter monthly salary: ");
        double monthlySalary = sc.nextDouble();
        System.out.println("Annual Salary: " + annualSalary.apply(monthlySalary));

        //Convert product price into discounted price (10% off)
        Function<Double, Double> discountedPrice = price -> price * 0.90;
        System.out.print("\nEnter product price: ");
        double price = sc.nextDouble();
        System.out.println("Discounted Price: " + discountedPrice.apply(price));

        sc.nextLine(); 
        
       
        //Convert employee name into uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        System.out.print("\nEnter employee name: ");
        String empName = sc.nextLine();
        System.out.println("Uppercase Name: " + toUpperCase.apply(empName));

        //Convert Celsius temperature into Fahrenheit
        Function<Double, Double> cToF = c -> (c * 9/5) + 32;
        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + cToF.apply(celsius));

        sc.close();
    }


}
