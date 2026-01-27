package com.annotation.roleallowed;
import java.lang.reflect.*;
import java.util.* ;

public class AccessControl {

	//method to run a method
	private static void runMethod(Object obj, Class<?> clazz, String methodName, String currentUserRole) throws Exception {
        Method method = clazz.getDeclaredMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (roleAllowed.value().equalsIgnoreCase(currentUserRole)) {
                method.invoke(obj);
            } else {
                System.out.println("Access Denied! Required role: " + roleAllowed.value());
            }
        }
        else {
          
            method.invoke(obj);
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		SecureService service = new SecureService();
        Class<?> clazz = service.getClass();

        //Taking user input and displaying result accordingly
        System.out.print("Enter your role (ADMIN/USER): ");
        String role = sc.nextLine();

        System.out.println("Choose a method to run:");
        System.out.println("1. adminTask");
        System.out.println("2. userTask");
        System.out.println("3. openTask");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        try {
            switch (choice) {
                case 1:
                    runMethod(service, clazz, "adminTask", role);
                    break;
                case 2:
                    runMethod(service, clazz, "userTask", role);
                    break;
                case 3:
                    runMethod(service, clazz, "openTask", role);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();


	}

}
