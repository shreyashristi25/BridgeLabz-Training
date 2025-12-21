import java.util.*      ;
public class EmployeeSalaryTable {

	// creating methods generateEmployeeData, calculateBonus, displayResults
	// To generate random employee data, calculate the bonus amount and dispaly the result
    public static int[][] generateEmployeeData(int n) {
        Random random = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = 10000 + random.nextInt(90000);
            int years = random.nextInt(11); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }
        return result;
    }
	
    public static void displayResults(double[][] result) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n",
        "EmpID", "Old Salary", "Years Service", "Bonus", "New Salary");

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            totalOldSalary += result[i][0];
            totalNewSalary += result[i][3];
            totalBonus += result[i][2];

             System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f\n",
            (i + 1), result[i][0], result[i][1], result[i][2], result[i][3]);

        }

        System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n",
        "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);

    }

	public static void main(String args []) {
	
		//calling methods and dispalying result
		int [][] employeeData = generateEmployeeData(10);
        double [][] result = calculateBonus(employeeData);
        displayResults(result);

    }
}