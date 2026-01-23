package com.musicapp;
import java.util.* ;

public class MusicApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		TrackBST bst = new TrackBST() ;
		
		//taking user choice as input and displaying result accordingly
		while(true) {
			System.out.println("------MUSIC APP------") ;
			System.out.println("1. Search Track") ;
			System.out.println("2. Insert New Track") ;
			System.out.println("3. Show Playlist Alphabetically : ") ;
			System.out.println("4. Exit  ") ;
			
			System.out.println("Enter your choice :") ;
			int choice = sc.nextInt();
					
			switch(choice) {
					
				case 1 :
							
					System.out.print("Enter TrackID to Search : ");
		            int searchSong = sc.nextInt();
		            Song found = bst.search(bst.root, searchSong);
		            if (found != null)
		            	System.out.println("Found: TrackID " + found.trackID +" |Title :" +found.name);
		            else
		                System.out.println("Track not found!");
		                break;
							

		        case 2:
		        	System.out.print("Enter TrackID: ");
		            int track = sc.nextInt();
		            sc.nextLine();
		                    
		            System.out.print("Enter title of the track: ");
		            String title = sc.nextLine();
		                    
		            bst.root = bst.insert(bst.root, track, title);
		                    
		            System.out.println("Song " + title + " added to track.") ;
		            break;

		        case 3:
		        	if (bst.root == null) {
		        		System.out.println("Track is empty!");
		            } 
		        	else {
		        		System.out.println("Playlist songs Alphabetically:");
		                bst.inorder(bst.root);
		            }
		            break;

		        case 4:
		        	System.out.println("Exiting........!");
		            sc.close();
		            return;

		        default:
		             System.out.println("Invalid choice! Try again.");
				}
						
			}
		
	}

}
