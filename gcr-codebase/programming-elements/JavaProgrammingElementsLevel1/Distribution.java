//create a class distribution 
public class Distribution {
   public static void main (String args[]) {
     
	 //creating variables to store number of pens, number of students, pens per studnet and number of undistributed pens
	 int pens = 14 ;
	 int students = 3 ;
	 int penPerStudent;
	 int undistributed;
	 
	 //check for equal distribution
	 if(pens % students == 0) {
	 penPerStudent = pens/students;
	 undistributed = 0;
	 }
	 else {
	 penPerStudent = pens/students ;
	 undistributed = pens % students ;
	 }
	 
	 //Displaying number of pens per student and the remaining pens not distributed
	 System.out.println ("The Pen Per Student is " +penPerStudent +" and the remaining pen not distributed is " +undistributed) ; 
	 
   }
}