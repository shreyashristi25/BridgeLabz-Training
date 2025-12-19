
import java.util.* ;
public class GradeAndRemark {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables physics, chemistry and maths
		System.out.println("Enter the marks of Physics : ") ;
		double physics = input.nextDouble() ;
		System.out.println("Enter the marks of Chemistry : ") ;
		double chemistry = input.nextDouble() ;
		System.out.println("Enter the marks of Maths : ") ;
		double maths = input.nextDouble() ;
		double averageMark  = 	(physics + chemistry + maths)/3 ;
		double averagePercent = (physics + chemistry + maths)/300*100 ;
		
		//checking average mark and assigning grade and remarks
		if(averagePercent >= 80){
			System.out.println ("The average mark is " +averageMark +" and the grade is A " +"and the remark is - Level 4, above agency-normalized standards") ;
		} 
		else if(averagePercent >= 70 ){
			System.out.println ("The average mark is " +averageMark +" and the grade is B " +"and the remark is - Level 3, at agency-normalized standards") ;
		} 
		else if(averagePercent >= 60 ){
			System.out.println ("The average mark is " +averageMark +" and the grade is C " +"and the remark is - Level 2, below, but approaching agency-normalized standards") ;
		} 
		else if(averagePercent >= 50 ){
			System.out.println ("The average mark is " +averageMark +" and the grade is D " +"and the remark is - Level 1, well below agency-normalized standards") ;
		} 
		else if(averagePercent >= 40 ){
			System.out.println ("The average mark is " +averageMark +" and the grade is E " +"and the remark is - Level 1-, too below agency-normalized standards") ;
		} 
		else {
			System.out.println ("The average mark is " +averageMark +" and the grade is R " +"and the remark is - Remedial standards") ;
		} 
		input.close() ;
	}
}