package com.streams;
import java.io.* ;
import java.util.* ;

public class StudentDataStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String filename = "students.dat";

        // taking user input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Storing data using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Student " + (i+1));

                System.out.print("Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("GPA: ");
                double gpa = sc.nextDouble();
                sc.nextLine();

                dos.writeInt(roll);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
            }
            System.out.println(" Data saved successfully to " + filename);
        }
        catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        // Retrieving data using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println(" Retrieved Student Records:");
            for (int i = 0; i < n; i++) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll: " + roll + " | Name: " + name + " | GPA: " + gpa);
            }
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        sc.close();

	}

}
