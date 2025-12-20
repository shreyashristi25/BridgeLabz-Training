
import java.util.*   ;
public class YoungestTallest {

	// creating methods findYoungest and findTallest to find youngest and tallest friend
    public static String findYoungest(String[] names, int[] ages) {
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[index]) {
                index = i;
            }
        }
        return names[index];
    }
	public static String findTallest(String[] names, int[] heights) {
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[index]) {
                index = i;
            }
        }
        return names[index];
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in)  ;
		String [] names = {"Amar", "Akbar", "Anthony"};

        //creating arrays ages and heights, checking for youngest and tallest, and displaying result
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = input.nextInt();
        }
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("The youngest friend is : " + youngest);
        System.out.println("The tallest friend is : " + tallest);

        input.close() ;
    }
}