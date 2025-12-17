//create a class Marks to calculate the total marks of Sam
public class Marks {
   public static void main ( String args[] ) {
   
      //create variables to assign marks of different subjects
      int maths = 94 ;
	  
	  int physics = 95 ;
	  
	  int chemistry = 96 ;
	  
	  //create variable to calculate total marks of the subjects
	  int totalMarks = (maths + physics + chemistry) / 3  ;
	  
	  //Display the result
	  System.out.println ( "Sam's average mark in PCM is" + " " +totalMarks) ;
   }
 }