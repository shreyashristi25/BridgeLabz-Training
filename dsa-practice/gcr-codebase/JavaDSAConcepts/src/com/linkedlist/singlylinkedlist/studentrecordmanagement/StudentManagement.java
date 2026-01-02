package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentManagement {

	public static void main(String[] args) {
		
		StudentLinkedList list = new StudentLinkedList();

        // Sample operations
        list.addAtBeginning(1, "Alia", 20, "A");
        list.addAtEnd(2, "Bob", 21, "B");
        list.addAtPosition(2, 3, "Shruti", 22, "C");

        list.displayRecords();

        list.searchByRollNo(2);

        list.updateGrade(3, "A+");
        list.displayRecords();

        list.deleteByRollNo(1);
        list.displayRecords();


	}

}
