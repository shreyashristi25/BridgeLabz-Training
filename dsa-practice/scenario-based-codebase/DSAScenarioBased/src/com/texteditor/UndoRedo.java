package com.texteditor;
import java.util.* ;

public class UndoRedo {

	private StringBuilder content ;
	private Stack<Operation> undo = new Stack<>() ;
	private Stack<Operation> redo = new Stack<> () ;
	
	//constructor
	public UndoRedo() {
		content = new StringBuilder() ;
		undo = new Stack<>() ;
		redo = new Stack<> () ;
	}
	
	//method to insert and delete
	public void insert(String text, int position) {
		content.insert(position, text) ;
		undo.push(new Operation("insert", text, position)) ;
		redo.clear() ;
	}
	public void delete(int position, int length) {
		String deleted = content.substring(position, position + length);
        content.delete(position, position + length);
        undo.push(new Operation("delete", deleted, position));
        redo.clear();
	}
	
	//method to undo and redo operations
	public void undo() {
	    if (undo.isEmpty()) {
	        System.out.println("Nothing to undo.");
	        return; 
	    }
	    Operation op = undo.pop();
	    if (op.type.equals("insert")) {
	        content.delete(op.position, op.position + op.text.length());
	    } else if (op.type.equals("delete")) {
	        content.insert(op.position, op.text);
	    }
	    redo.push(op);
	}

	
	public void redo() {
	    if (redo.isEmpty()) {
	        System.out.println("Nothing to redo.");
	        return; 
	    }
	    Operation op = redo.pop();
	    if (op.type.equals("insert")) {
	        content.insert(op.position, op.text);
	    } else if (op.type.equals("delete")) {
	        content.delete(op.position, op.position + op.text.length());
	    }
	    undo.push(op);
	}

	
	//method to show content
	public void showContent() {
		System.out.println("Content : " + content.toString()) ;
	}
	
}
