package com.jdbc.studentmanagementsystem;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {

    private static final StudentDAO dao = new StudentDAO();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. View by ID");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAll();
                case 3 -> viewById();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Grade: ");
        String grade = sc.nextLine();

        if (dao.insertStudent(new Student(0, name, email, age, grade)))
            System.out.println("Student Added!");
        else
            System.out.println("Error!");
    }

    private static void viewAll() {
        List<Student> list = dao.getAllStudents();

        if (list.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        list.forEach(System.out::println);
    }

    private static void viewById() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student s = dao.getStudentById(id);

        if (s == null)
            System.out.println("Not found.");
        else
            System.out.println(s);
    }

    private static void updateStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student s = dao.getStudentById(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("New name: ");
        s.setName(sc.nextLine());

        System.out.print("New email: ");
        s.setEmail(sc.nextLine());

        System.out.print("New age: ");
        s.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("New grade: ");
        s.setGrade(sc.nextLine());

        if (dao.updateStudent(s))
            System.out.println("Updated!");
        else
            System.out.println("Failed!");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (dao.deleteStudent(id))
            System.out.println("Deleted!");
        else
            System.out.println("Failed!");
    }
}
