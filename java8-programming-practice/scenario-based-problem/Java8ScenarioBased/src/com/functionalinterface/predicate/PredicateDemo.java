package com.functionalinterface.predicate;
import java.util.* ;
import java.util.function.*;
public class PredicateDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student exam eligibility
        System.out.print("Enter student name: ");
        String sName = sc.nextLine();
        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();
        Student student = new Student(sName, attendance);

        Predicate<Student> eligibleForExam = s -> s.attendance >= 75;
        System.out.println(student.name + " eligible for exam: " + eligibleForExam.test(student));

        //Employee salary check
        sc.nextLine(); 
        System.out.print("\nEnter employee name: ");
        String eName = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(eName, salary);

        Predicate<Employee> highSalary = e -> e.salary > 30000;
        System.out.println(emp.name + " salary > 30000: " + highSalary.test(emp));

        //Bank withdrawal validation
        sc.nextLine();
        System.out.print("\nEnter account holder name: ");
        String accName = sc.nextLine();
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        Account acc = new Account(accName, balance);

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        Predicate<Double> validWithdrawal = amt -> amt <= acc.balance;
        System.out.println("Withdrawal valid: " + validWithdrawal.test(withdrawal));

        //E-commerce free delivery eligibility
        System.out.print("\nEnter order amount: ");
        double orderAmount = sc.nextDouble();
        Predicate<Double> freeDelivery = amt -> amt > 500;
        System.out.println("Order eligible for free delivery: " + freeDelivery.test(orderAmount));

        //Even/Odd check
        System.out.print("\nEnter a number to check even/odd: ");
        int num = sc.nextInt();
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(num + " is even: " + isEven.test(num));

        sc.close();
    }


}
