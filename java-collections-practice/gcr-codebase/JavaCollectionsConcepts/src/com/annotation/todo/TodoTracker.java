package com.annotation.todo;
import java.util.* ;
import java.lang.reflect.*;
public class TodoTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // --- Static tasks via annotations ---
        System.out.println("=== Static Pending Tasks (via @Todo Annotation) ===");
        Class<ProjectFeatures> clazz = ProjectFeatures.class;
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println("-----------------------------------");
            }
        }

        // --- Dynamic tasks via user input ---
        System.out.println("=== Enter Your Own Pending Tasks ===");
        List<Map<String, String>> userTasks = new ArrayList<>();

        System.out.print("How many tasks do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            Map<String, String> taskMap = new HashMap<>();
            System.out.println("Task " + (i + 1) + ":");
            System.out.print("Enter task description: ");
            taskMap.put("task", sc.nextLine());

            System.out.print("Assigned to: ");
            taskMap.put("assignedTo", sc.nextLine());

            System.out.print("Priority (HIGH/MEDIUM/LOW): ");
            String priority = sc.nextLine();
            if (priority.isEmpty()) priority = "MEDIUM"; 
            taskMap.put("priority", priority);

            userTasks.add(taskMap);
        }

        // Printing user-entered tasks
        System.out.println("=== User Entered Pending Tasks ===");
        for (int i = 0; i < userTasks.size(); i++) {
            Map<String, String> t = userTasks.get(i);
            System.out.println("Task " + (i + 1) + ": " + t.get("task"));
            System.out.println("  Assigned To: " + t.get("assignedTo"));
            System.out.println("  Priority: " + t.get("priority"));
            System.out.println("-----------------------------------");
        }

        sc.close();


	}

}
