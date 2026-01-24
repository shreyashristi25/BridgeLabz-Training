package com.streams.objectserialization;
import java.io.* ;
import java.util.*;

public class EmployeeSerialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		List<Employee> employees = new ArrayList<>();

		//taking user input for number of employees and their details
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.add(new Employee(id, name, dept, salary));
        }

        // Save (Serialize)
        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oout.writeObject(employees);
            System.out.println("Data saved successfully!");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Retrieve (Deserialize)
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> list = (List<Employee>) oin.readObject();
            System.out.println("Retrieved Employees:");
            for (Employee e : list) {
                System.out.println(e);
            }
        } 
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }

        sc.close();

	}

}
