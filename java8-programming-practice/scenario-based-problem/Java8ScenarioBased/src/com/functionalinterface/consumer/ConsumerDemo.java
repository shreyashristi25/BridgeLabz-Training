package com.functionalinterface.consumer;
import java.util.* ;
import java.util.function.*;

public class ConsumerDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print student details
        System.out.print("Enter student name: ");
        String sName = sc.nextLine();
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();
        Student student = new Student(sName, marks);

        Consumer<Student> printStudent = s -> System.out.println(s);
        printStudent.accept(student);

        sc.nextLine(); 

        // Log employee login activity
        System.out.print("\nEnter employee name: ");
        String eName = sc.nextLine();
        Employee emp = new Employee(eName);

        Consumer<Employee> logLogin = e -> System.out.println("Employee " + e.name + " logged in at " + new Date());
        logLogin.accept(emp);

        // Print order confirmation message
        System.out.print("\nEnter product name: ");
        String product = sc.nextLine();
        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();
        Order order = new Order(product, amount);

        Consumer<Order> confirmOrder = o -> System.out.println("Order confirmed for " + o.product + " worth Rs. " + o.amount);
        confirmOrder.accept(order);

        //  Display account balance
        sc.nextLine();
        System.out.print("\nEnter account holder name: ");
        String accName = sc.nextLine();
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        Account acc = new Account(accName, balance);

        Consumer<Account> displayBalance = a -> System.out.println("Account Holder: " + a.holder + ", Balance: Rs. " + a.balance);
        displayBalance.accept(acc);

        sc.nextLine();

        // Send notification message
        System.out.print("\nEnter notification message: ");
        String message = sc.nextLine();

        Consumer<String> notify = msg -> System.out.println("Notification sent: " + msg);
        notify.accept(message);

        sc.close();
	}
}
