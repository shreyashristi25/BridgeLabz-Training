package com.linkedlist.doublylinkedlist.undoredo;

public class TextEditorHistory {

	private TextState head;
    private TextState tail;
    private TextState current;
    private int size;
    private final int MAX_SIZE = 10; 

    // method to add new text state
    public void addState(String content) {
        TextState newNode = new TextState(content);

        if (current != null && current.next != null) {
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        current = newNode;
        size++;

        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    // method to Undo: move to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed. Current state: " + current.content);
        } else {
            System.out.println("No more undo available!");
        }
    }

    // method to Redo: move to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed. Current state: " + current.content);
        } else {
            System.out.println("No more redo available!");
        }
    }

    // method to display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available!");
        }
    }

    // method for debugging: display all states forward
    public void displayAllStates() {
        TextState temp = head;
        System.out.println("History States:");
        while (temp != null) {
            System.out.println(temp.content + (temp == current ? " <-- Current" : ""));
            temp = temp.next;
        }
    }


	public static void main(String[] args) {


		 TextEditorHistory editor = new TextEditorHistory();

	     // Simulate typing
	     editor.addState("Hello");
	     editor.addState("Hello World");
	     editor.addState("Hello World!");
	     editor.displayCurrentState();

	     // Undo operations
	     editor.undo();
	     editor.undo();

	     // Redo operation
	     editor.redo();

	     // Add new state after undo 
	     editor.addState("Hello World! This is Shreya.");
	     editor.displayAllStates();

	     // Undo/Redo again
	     editor.undo();
	     editor.displayCurrentState();
	     editor.redo();
	     editor.displayCurrentState();


	}

}
