package com.gamingapp;

public class PlayerAVL {

	private Player root ;
	
	//method to get height of AVL tree and balance of AVL tree
	private int getHeight (Player n) {
		return (n == null) ? 0 : n.height ;
	}
	
	private int getBalance(Player n ) {
		return (n ==  null) ? 0 : getHeight(n.left) - getHeight(n.right) ;
	}
	
	//methods to right rotate and left rotate AVL tree
	private Player rightRotate(Player y) {
		
		if(y == null || y.left == null) {
			return y ;
		}
		Player x = y.left ;
		Player T2 = x.right ;
		
		x.right = y ;
		y.left = T2 ;
		
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) ;
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) ;
		
		return x;
	}
	
	private Player leftRotate(Player x) {
		
		if(x == null || x.right == null) {
			return x ;
		}
		Player y = x.left ;
		Player T2 = y.right ;
		
		y.right = x ;
		x.left = T2 ;
		
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) ;
		y.height = Math.max(getHeight(y.left), getHeight(y.left)) ;
		
		return y ;
		
	}
	
	//methods to insert and delete players from the AVL tree
	public void insert(String playerName, int score ) {
		root = insertRec(root, playerName, score) ;
	}
	
	public Player insertRec(Player node, String playerName, int score) {
		if(node ==  null) {
			return new Player(playerName, score) ;
		}
		
		if(score > node.score) {
			node.left = insertRec(node.left, playerName, score) ;
		}
		else if (score < node.score) {
			node.right = insertRec(node.right, playerName, score) ;
		}
		else {
			node.playerName = playerName ;
			return node ;
		}
		
		node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right) ) ;
		int balance = getBalance(node) ;
		
		if (balance > 1 && node.left != null && score > node.left.score) {
	        return rightRotate(node);
		}
		
	    if (balance < -1 && node.right != null && score < node.right.score) {
	        return leftRotate(node);
	    }

	    if (balance > 1 && node.left != null && score < node.left.score) {
	        node.left = leftRotate(node.left);
	        return rightRotate(node);
	    }

	    if (balance < -1 && node.right != null && score > node.right.score) {
	        node.right = rightRotate(node.right);
	        return leftRotate(node);
	    }


		return node ;
		
	}
	
	public void delete(int score) {
		root = deleteRec(root, score) ;
	}
	
	public Player deleteRec(Player root, int score) {
		if( root == null) {
			return root ;
		}
		
		if(score> root.score) {
			root.left = deleteRec(root.left, score) ;
		}
		else if(score < root.score) {
			root.right = deleteRec(root.right , score) ;
		}
		else {
			if((root.left == null) || root.right == null) {
				Player temp = (root.left != null) ? root.left : root.right ;
				root = (temp ==  null) ? null : temp ;
			}
			
			else  {
				Player temp = minValueNode(root.right) ;
				root.score = temp.score ;
				root.playerName = temp.playerName ;
				root.right = deleteRec(root.right, temp.score) ;
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
	
	private Player minValueNode(Player node) {
		Player current = node ;
		while(current.left != null) {
			current = current.left ;
			
		}
		return current ; 
	}	
	
	public void displayTopK(int k ) {
		System.out.println("Top " +k+ " players are : " ) ;
		displayTopKRec(root, k , new int [] {0}) ;
	}
	
	public void displayTopKRec(Player node, int k , int [] count) {
		if(node == null || count[0] >= k) {
			return ;
		}
		
		displayTopKRec(node.left, k, count) ;
		
		if(count [0] < k) {
			System.out.println(node.playerName +" : " +node.score) ;
			count[0] ++ ;
		}
		
		displayTopKRec(node.right, k , count) ;
	}
	
}

