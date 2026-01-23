package com.universityrecord;

public class StudentBST {

	public Student root ;
	
	//method to insert new node in the binary search tree
	Student insert(Student root, int rollNumber ,String name, String course) {
		if(root == null) {
			return new Student (rollNumber, name, course) ;
		}
		if(rollNumber < root.rollNumber) {
			root.left = insert(root.left, rollNumber, name, course) ;
		}
		else if(rollNumber > root.rollNumber){
			root.right = insert(root.right, rollNumber, name, course) ;
		}
		
		return root ;
	}
	
	//method to delete node in the binary search tree
	Student delete (Student root, int rollNumber) {
		if( root == null) {
			return null ;
		}
		if(rollNumber < root.rollNumber) {
			root.left = delete(root.left, rollNumber) ;
		}
		else if (rollNumber > root.rollNumber) {
			root.right = delete (root.right, rollNumber) ;
		}
		else {
			if( root.left == null) {
				return root.right ;
			}
			else  if(root.right ==  null) {
				return root.left ;
			}
			
			Student successor = minValue(root.right) ;
			root.rollNumber = successor.rollNumber ;
			root.name = successor.name ;
			root.course = successor.course ;
			root.right = delete(root.right, successor.rollNumber) ;
		}
		return root ;
	}
	
	//method to find minimum valued node in the binary search tree
	Student minValue (Student node) {
		while(node.left != null) {
			node = node.left ;
		}
		return node ;
	}
	
	//methods to search and find inorder of a binary search tree
	Student search(Student root, int rollNumber) {
		if( root == null || root.rollNumber == rollNumber) {
			return root ;
		}
		if(rollNumber < root.rollNumber) {
			return search(root.left, rollNumber) ;
		}

		return search(root.right, rollNumber) ;
		
	}
	
 	void inorder(Student root) {
		if( root != null) {
			inorder (root.left) ;
			System.out.println(root.rollNumber +" : " + root.name + "(" +root.course +")") ;
			inorder(root.right) ;
		}
	}
}
