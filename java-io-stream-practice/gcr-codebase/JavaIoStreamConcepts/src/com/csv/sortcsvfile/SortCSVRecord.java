package com.csv.sortcsvfile;
import java.io.* ;
import java.util.* ;

public class SortCSVRecord {

	public static void main(String[] args) {
		 String filePath = "employees.csv";
	     List<Employee> employees = new ArrayList<>();

	     // Reading  CSV
	     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	    	 String line;
	    	 br.readLine(); 
	    	 
	    	 while ((line = br.readLine()) != null) {
	    		 String[] record = line.split(",");
	    		 employees.add(new Employee(
	    			record[0].trim(),
	    			record[1].trim(),
	    			record[2].trim(),
	    			Integer.parseInt(record[3].trim())
	    	));
	    	}
        } 
	    catch (IOException e) {
	    	e.printStackTrace();
	    }

	     // Sort by salary (descending)
	     employees.sort((e1, e2) -> Integer.compare(e2.salary, e1.salary));

	     // Printing top 5
	     System.out.println("Top 5 Highest-Paid Employees:");
	     for (int i = 0; i < Math.min(5, employees.size()); i++) {
	    	 System.out.println(employees.get(i));
	     }


	}

}
