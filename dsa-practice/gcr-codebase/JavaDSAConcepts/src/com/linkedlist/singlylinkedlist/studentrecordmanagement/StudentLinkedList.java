package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {

	private StudentNode head;

    // method to add a new student at beginning
    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // method to add a new student at end
    public void addAtEnd(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // method to add a new student at specific position 
    public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        StudentNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // method to delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student with Roll No " + rollNo + " deleted.");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student with Roll No " + rollNo + " deleted.");
        }
    }

    // method to search by Roll Number
    public void searchByRollNo(int rollNo) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found: RollNo=" + temp.rollNo + ", Name=" + temp.name +
                        ", Age=" + temp.age + ", Grade=" + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // method to update Grade by Roll Number
    public void updateGrade(int rollNo, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll No " + rollNo);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // method to display all records
    public void displayRecords() {
        if (head == null) {
            System.out.println("No student records!");
            return;
        }
        StudentNode temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("RollNo=" + temp.rollNo + ", Name=" + temp.name +
                    ", Age=" + temp.age + ", Grade=" + temp.grade);
            temp = temp.next;
        }
    }

}
