package com.musicapp;

public class TrackBST {

	Song root ;
	
	//method to insert a new song
	Song insert(Song root, int trackID, String name) {
		if(root == null) {
			return new Song( trackID, name) ;
		}
		else if(root.trackID < trackID )  {
			root.left =  insert(root.left, trackID, name) ;
		}
		else if(root.trackID > trackID) {
			root.right = insert(root.right, trackID, name) ;
		}
		return root ;
	}
	
	//methods to search a song in a track and print the track songs alphabetically
	Song search(Song root, int trackID) {
		if(root == null || root.trackID == trackID) {
			return root ;
		}
		else if(trackID < root.trackID) {
			return search(root.left, trackID) ;
		}
		return search(root.right, trackID) ;
		
	}
	void inorder(Song root) {
	    if (root == null) {
	        return;  
	    }
	    inorder(root.left);
	    System.out.println("TrackID: " + root.trackID + " | Title: " + root.name );
	    inorder(root.right);
	}
	
}
