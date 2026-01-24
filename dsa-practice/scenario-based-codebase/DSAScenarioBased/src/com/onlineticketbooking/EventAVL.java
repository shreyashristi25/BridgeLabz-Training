package com.onlineticketbooking;

public class EventAVL {

	private Event root ;
	
	//method to get height of AVL tree and balance of AVL tree
	private int getHeight (Event n) {
		return (n == null) ? 0 : n.height ;
	}
	
	private int getBalance(Event n ) {
		return (n ==  null) ? 0 : getHeight(n.left) - getHeight(n.right) ;
	}
	
	//methods to right rotate and left rotate AVL tree
	private Event rightRotate(Event y) {
		
		if(y == null || y.left == null) {
			return y ;
		}
		Event x = y.left ;
		Event T2 = x.right ;
		
		x.right = y ;
		y.left = T2 ;
		
		y.height = 1+ Math.max(getHeight(y.left), getHeight(y.right)) ;
		x.height =1 + Math.max(getHeight(x.left), getHeight(x.right)) ;
		
		return x;
	}
	
	private Event leftRotate(Event x) {
		
		if(x == null || x.right == null) {
			return x ;
		}
		Event y = x.right ;
		Event T2 = y.left ;
		
		y.right = x ;
		x.left = T2 ;
		
		x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right)) ;
		y.height = 1 + Math.max(getHeight(y.left), getHeight(y.left)) ;
		
		return y ;
		
	}

	//method to compare time of events
	private int compareTime(int t1, int t2) {
		return Integer.compare(t1, t2) ;
	}
	
	//method to add and cancel events
	public void insert(String name, int time ) {
		root = insertRec(root, name, time) ;
		System.out.println("Event : " + name + " added at " + formatTime(time));
	}

	public Event insertRec(Event node, String name, int time) {
		if(node ==  null) {
			return new Event(name, time) ;
		}
		
		if(compareTime(time, node.time) < 0) {
			node.left = insertRec(node.left, name, time) ;
		}
		else if (compareTime(time, node.time) > 0) {
			node.right = insertRec(node.right, name, time) ;
		}
		else {
			node.name = name ;
			return node ;
		}
		
		node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right) ) ;
		int balance = getBalance(node) ;
		
		if (balance > 1 && compareTime(time, node.left.time) < 0) {
			return rightRotate(node);
		}
        if (balance < -1 && compareTime(time, node.right.time) > 0) {
        	return leftRotate(node);
        }
        if (balance > 1 && compareTime(time, node.left.time) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && compareTime(time, node.right.time) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

		return node ;
		
	}
	
	public void cancel(int time) {
        root = cancelRec(root, time);
        System.out.println("Event at " + formatTime(time) + " cancelled.");
    }

    private Event cancelRec(Event root, int time) {
        if (root == null) return root;

        if (compareTime(time, root.time) < 0) {
            root.left = cancelRec(root.left, time);
        } 
        else if (compareTime(time, root.time) > 0) {
            root.right = cancelRec(root.right, time);
        } 
        else {
            if ((root.left == null) || (root.right == null)) {
                Event temp = (root.left != null) ? root.left : root.right;
                root = (temp == null) ? null : temp;
            } 
            else {
                Event temp = minValueNode(root.right);
                root.time = temp.time;
                root.name = temp.name;
                root.right = cancelRec(root.right, temp.time);
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
	private Event minValueNode(Event node) {
		Event current = node ;
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

	//method to display all the scheduled events
	public void showEvents() {
		System.out.println("Upcoming Events :::: " ) ;
		inorder(root) ;
	}
	
	private void inorder(Event node) {
		if( node != null) {
			inorder(node.left) ;
			System.out.println(formatTime(node.time) + " - " + node.name);
			inorder(node.right) ;
		}
	}
	
}
