package com.optionalinterface.employeeofficemanagemnt;
import java.util.* ;

public class OptionalEmployeeDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details from user 
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter manager name (or press Enter if missing): ");
        String manager = sc.nextLine();
        
        if (manager.isEmpty()) manager = null;
        System.out.print("Enter bonus amount (or press Enter if missing): ");
        String bonusStr = sc.nextLine();
        
        Double bonus = bonusStr.isEmpty() ? null : Double.parseDouble(bonusStr);
        System.out.print("Enter email ID (or press Enter if missing): ");
        String email = sc.nextLine();
        
        if (email.isEmpty()) email = null;
        System.out.print("Enter insurance details (or press Enter if missing): ");
        String insurance = sc.nextLine();
        
        if (insurance.isEmpty()) insurance = null;
        System.out.print("Enter middle name (or press Enter if missing): ");
        String middleName = sc.nextLine();
        
        if (middleName.isEmpty()) middleName = null;

        Employee emp = new Employee(id, name, manager, bonus, email, insurance, middleName);

        // Fetch manager details safely
        System.out.println("\nManager: " + emp.manager.orElse("Manager not assigned"));

        // Fetch bonus amount safely
        System.out.println("Bonus: " + emp.bonus.orElse(0.0));


        // Find employee by email ID, throw exception if not found
        try {
            Optional<Employee> found = emp.email.map(e -> emp);
            Employee result = found.orElseThrow(() -> new EmployeeNotFoundException("Employee not available"));
            System.out.println("Employee found: " + result.name);
        } catch (EmployeeNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        //  Get insurance details safely
        System.out.println("Insurance: " + emp.insurance.orElse("No insurance details"));

        // Display middle name only if present
        emp.middleName.ifPresent(m -> System.out.println("Middle Name: " + m));

        sc.close();
    }

}
