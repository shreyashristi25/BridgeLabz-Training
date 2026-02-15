package com.healthcheckpro;
import java.lang.annotation.*;
import java.lang.reflect.Method;


public class HealthCheckPro {

	public static void main(String[] args) {
		Class<?> controllerClass = LabTestController.class;

        System.out.println("=== API Documentation ===");
        for (Method method : controllerClass.getDeclaredMethods()) {
            System.out.println("\nMethod: " + method.getName());

            // Check @PublicAPI
            if (method.isAnnotationPresent(PublicAPI.class)) {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println(" - Public API: " + api.description());
            } else {
                System.out.println(" - WARNING: Missing @PublicAPI annotation!");
            }

            // Check @RequireAuth
            if (method.isAnnotationPresent(RequireAuth.class)) {
                RequireAuth auth = method.getAnnotation(RequireAuth.class);
                System.out.println(" - Requires Auth: Role = " + auth.role());
            } else {
                System.out.println(" - No authentication required");
            }
        }
    }

	

}
