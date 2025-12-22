
import java.util.*;
public class RockPaperScissors {
	
	//creating methods getComputerChoice, findWinner, summarizeResults, displayResults
	//To get computer's choice using random() method, finding winner,  summarize the overall result and display result
	
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0,1,2
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if (userChoice.equals("rock")) {
            return (computerChoice.equals("scissors")) ? "User" : "Computer";
        } else if (userChoice.equals("paper")) {
            return (computerChoice.equals("rock")) ? "User" : "Computer";
        } else if (userChoice.equals("scissors")) {
            return (computerChoice.equals("paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }
	public static String [][] summarizeResults(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercentage = ((double)userWins / totalGames) * 100;
        double computerPercentage = ((double)computerWins / totalGames) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercentage) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage) + "%";

        return stats;
    }
	 public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("Final Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("----------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//getting user input, calling functions and displaying result
		
        System.out.println("Enter number of games to play:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[n][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Game " + (i+1) + ": Enter your choice (rock/paper/scissors):");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String [][] stats = summarizeResults(userWins, computerWins, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}

