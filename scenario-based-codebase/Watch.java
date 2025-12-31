			
public class Watch {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i == 13 && j == 0) {
                    System.out.println("Power cut. Stopping watch at 13:00.");
                    break outerLoop;
                }
                System.out.printf("%02d:%02d%n", i, j);
            }
			System.out.println() ;
        }
    }
}


