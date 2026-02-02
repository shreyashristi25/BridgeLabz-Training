package com.functionalinterfaces.dataexportfeature;
import java.util.* ;

public class ExporterMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 //taking user choice for old and new versions 
	     System.out.println("Choose exporter:");
	     System.out.println("1. CSVExporter (old)");
	     System.out.println("2. AdvancedExporter (new)");
	     System.out.println("Enter your choice  : ") ;
	     int choice = sc.nextInt();
	     sc.nextLine(); 

	     ReportExporter exporter;

	     if (choice == 1) {
	    	 exporter = new CSVExporter();
	     }
	     else if (choice == 2) {
	    	 exporter = new AdvancedExporter();
	     }
	     else {
	    	 System.out.println("Invalid choice!");
	    	 sc.close();
	    	 return;
	     }

	     System.out.print("Enter report data: ");
	     String data = sc.nextLine();

	     //taking user choice for file format and displaying result accordingly
	     System.out.println("Choose format:");
	     System.out.println("1. CSV");
	     System.out.println("2. PDF");
	     System.out.println("3. JSON");
	     System.out.println("Enter your choice  : ") ;
	     
	     int format = sc.nextInt();

	     switch (format) {
	     case 1:
	    	 exporter.exportToCSV(data);
	    	 break;
	     case 2:
	    	 exporter.exportToPDF(data);
	    	 break;
         case 3:
        	 exporter.exportToJSON(data);
        	 break;
         default:
        	 System.out.println("Invalid format!");
        }

        sc.close();

	}

}
