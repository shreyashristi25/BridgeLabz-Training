package com.functionalinterface.comparator;
import java.util.* ;
import java.util.function.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Compare two students by rank
        System.out.print("Enter first student name: ");
        String s1Name = sc.nextLine();
        System.out.print("Enter first student rank: ");
        int s1Rank = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second student name: ");
        String s2Name = sc.nextLine();
        System.out.print("Enter second student rank: ");
        int s2Rank = sc.nextInt();
        sc.nextLine();

        Student st1 = new Student(s1Name, s1Rank);
        Student st2 = new Student(s2Name, s2Rank);

        Comparator<Student> compareByRank = (a, b) -> Integer.compare(a.rank, b.rank);
        System.out.println("Comparison by rank: " + compareByRank.compare(st1, st2));


        // Compare two employees by salary
        System.out.print("\nEnter first employee name: ");
        String e1Name = sc.nextLine();
        System.out.print("Enter first employee salary: ");
        double e1Salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter second employee name: ");
        String e2Name = sc.nextLine();
        System.out.print("Enter second employee salary: ");
        double e2Salary = sc.nextDouble();
        sc.nextLine();

        Employee emp1 = new Employee(e1Name, e1Salary);
        Employee emp2 = new Employee(e2Name, e2Salary);

        Comparator<Employee> compareBySalary = (a, b) -> Double.compare(a.salary, b.salary);
        System.out.println("Comparison by salary: " + compareBySalary.compare(emp1, emp2));

        // Compare two products by price
        System.out.print("\nEnter first product name: ");
        String p1Name = sc.nextLine();
        System.out.print("Enter first product price: ");
        double p1Price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter second product name: ");
        String p2Name = sc.nextLine();
        System.out.print("Enter second product price: ");
        double p2Price = sc.nextDouble();
        sc.nextLine();

        Product prod1 = new Product(p1Name, p1Price);
        Product prod2 = new Product(p2Name, p2Price);

        Comparator<Product> compareByPrice = (a, b) -> Double.compare(a.price, b.price);
        System.out.println("Comparison by price: " + compareByPrice.compare(prod1, prod2));

        // Compare two strings by length
        System.out.print("\nEnter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        Comparator<String> compareByLength = (a, b) -> Integer.compare(a.length(), b.length());
        System.out.println("Comparison by length: " + compareByLength.compare(str1, str2));

        // Compare two bank accounts by balance
        System.out.print("\nEnter first account holder name: ");
        String acc1Name = sc.nextLine();
        System.out.print("Enter first account balance: ");
        double acc1Balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter second account holder name: ");
        String acc2Name = sc.nextLine();
        System.out.print("Enter second account balance: ");
        double acc2Balance = sc.nextDouble();

        Account acc1 = new Account(acc1Name, acc1Balance);
        Account acc2 = new Account(acc2Name, acc2Balance);

        Comparator<Account> compareByBalance = (a, b) -> Double.compare(a.balance, b.balance);
        System.out.println("Comparison by balance: " + compareByBalance.compare(acc1, acc2));

        sc.close();



	}

}
