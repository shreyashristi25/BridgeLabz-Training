
import java.util.* ;
public class SchoolBusAttendanceSystem {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		String [] students ={"Shreya", "Priya", "Rishabh", "Satyam", "Vishal", "Riya", "Yash", "Rahul", "Krish", "Shruti"} ;
		
		String s = "" ;
		int presentCount =0;
		int absentCount = 0;
		System.out.println("----------Taking Attendance---------") ;
		System.out.println() ;
		for(int i=0; i < students.length; i++) {
			System.out.println(students[i]+" " +"(Present or Absent)?") ;
			String s1 =  sc.next();
			s = s1;
			if(s1.equalsIgnoreCase("Present")) {
				presentCount++ ;
			}
			else{
				absentCount++ ;
			}
		}
		System.out.println("The number of students present is :" + presentCount); 
		System.out.println("The number of students absent is :" + absentCount); 
		sc.close() ;
	}
}