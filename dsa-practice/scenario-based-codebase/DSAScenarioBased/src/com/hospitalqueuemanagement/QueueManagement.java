package com.hospitalqueuemanagement;


public class QueueManagement {


	private Patient root ;
	
	//method to get height of AVL tree and balance of AVL tree
	private int getHeight (Patient n) {
		return (n == null) ? 0 : n.height ;
	}
	
	private int getBalance(Patient n ) {
		return (n ==  null) ? 0 : getHeight(n.left) - getHeight(n.right) ;
	}
	
	//methods to right rotate and left rotate AVL tree
	private Patient rightRotate(Patient y) {
		
		if(y == null || y.left == null) {
			return y ;
		}
		Patient x = y.left ;
		Patient T2 = x.right ;
		
		x.right = y ;
		y.left = T2 ;
		
		y.height = 1+ Math.max(getHeight(y.left), getHeight(y.right)) ;
		x.height =1 + Math.max(getHeight(x.left), getHeight(x.right)) ;
		
		return x;
	}
	
	private Patient leftRotate(Patient x) {
		
		if(x == null || x.right == null) {
			return x ;
		}
		Patient y = x.right ;
		Patient T2 = y.left ;
		
		y.right = x ;
		x.left = T2 ;
		
		x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right)) ;
		y.height = 1 + Math.max(getHeight(y.left), getHeight(y.left)) ;
		
		return y ;
		
	}

	//method to compare time of Patients
	private int compareTime(int t1, int t2) {
		return Integer.compare(t1, t2) ;
	}
	
	//method to add and discharge Patients
	public void register(String name, int checkInTime ) {
		root = insertRec(root, name, checkInTime) ;
		System.out.println("Patient : " + name + " registered at " + formatTime(checkInTime));
	}

	public Patient insertRec(Patient node, String name, int time) {
		if(node ==  null) {
			return new Patient(name, time) ;
		}
		
		if(compareTime(time, node.checkInTime) < 0) {
			node.left = insertRec(node.left, name, time) ;
		}
		else if (compareTime(time, node.checkInTime) > 0) {
			node.right = insertRec(node.right, name, time) ;
		}
		else {
			node.name = name ;
			return node ;
		}
		
		node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right) ) ;
		int balance = getBalance(node) ;
		
		if (balance > 1 && compareTime(time, node.left.checkInTime) < 0) {
			return rightRotate(node);
		}
        if (balance < -1 && compareTime(time, node.right.checkInTime) > 0) {
        	return leftRotate(node);
        }
        if (balance > 1 && compareTime(time, node.left.checkInTime) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && compareTime(time, node.right.checkInTime) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

		return node ;
		
	}
	
	public void discharge(int time) {
        root = dischargeRec(root, time);
        System.out.println("Patient at " + formatTime(time) + " discharged.");
    }

    private Patient dischargeRec(Patient root, int time) {
        if (root == null) return root;

        if (compareTime(time, root.checkInTime) < 0) {
            root.left = dischargeRec(root.left, time);
        } 
        else if (compareTime(time, root.checkInTime) > 0) {
            root.right = dischargeRec(root.right, time);
        } 
        else {
            if ((root.left == null) || (root.right == null)) {
                Patient temp = (root.left != null) ? root.left : root.right;
                root = (temp == null) ? null : temp;
            } 
            else {
                Patient temp = minValueNode(root.right);
                root.checkInTime = temp.checkInTime;
                root.name = temp.name;
                root.right = dischargeRec(root.right, temp.checkInTime);
            }
        }

		if(root == null) {
			return root ;
		}
		
		root.height = Math.max(getHeight(root.left), getHeight(root.right))  +1 ; 
		int balance = getBalance(root) ;
		
		if(balance >  1 &&  getBalance(root.left) >= 0) {
			return rightRotate(root) ;
		}
		if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && getBalance(root.right) <= 0)  {
        	return leftRotate(root);
        }
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;	
	}
	
    //helper methods to find minimum value and format time
	private Patient minValueNode(Patient node) {
		Patient current = node ;
		while(current.left != null) {
			current = current.left ;
			
		}
		return current ; 
	}	
	
	private String formatTime(int time) {
	    int hours = time / 100;
	    int minutes = time % 100;

	    String suffix = (hours >= 12) ? "PM" : "AM";
	    if (hours == 0) hours = 12;          
	    else if (hours > 12) hours -= 12;    

	    return String.format("%02d:%02d %s", hours, minutes, suffix);
	}

	//method to display all the Patients
	public void showPatients() {
		System.out.println("Patients by arrival time :::: " ) ;
		inorder(root) ;
	}
	
	private void inorder(Patient node) {
		if( node != null) {
			inorder(node.left) ;
			System.out.println(formatTime(node.checkInTime) + " - " + node.name);
			inorder(node.right) ;
		}
	}
	
}


