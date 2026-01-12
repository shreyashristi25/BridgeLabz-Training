package com.texteditor;
import java.util.* ;
public class TextEditor {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//creating object of UndoRedo class 
		UndoRedo editor = new UndoRedo();

		//taking user choice as input, calling methods and displaying results accordingly
        while (true) {
           
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Content");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            	case 1:
            		System.out.print("Enter text to insert: ");
            		String text = sc.nextLine();
            		System.out.print("Enter position: ");
            		int pos = sc.nextInt();
            		editor.insert(text, pos);
            		break;

            	case 2:
            		System.out.print("Enter position to delete from: ");
            		int delPos = sc.nextInt();
            		System.out.print("Enter length to delete: ");
            		int len = sc.nextInt();
            		editor.delete(delPos, len);
            		break;

            	case 3:
            		editor.undo();
            		break;

            	case 4:
            		editor.redo();
            		break;

            	case 5:
            		editor.showContent();
            		break;

            	case 6:
            		System.out.println("Exiting TextEditor...");
            		return;

            	default:
            		System.out.println("Invalid choice!");
            }
        }
	}
}
