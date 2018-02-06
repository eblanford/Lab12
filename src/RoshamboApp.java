
/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * Roshambo Main App
 * 
 * Did not end up calling the generateRoshambo method
 */

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Variable declaration
		Scanner scan = new Scanner(System.in);
		TheRef user = new TheRef();
		Player rival;
		String playAgainst;
		String again = "y";
		int wins = 0;
		int losses = 0;
		int ties = 0;

		// Greeting
		System.out.println("Welcome to the Rock Paper Scissors!");

		// Collects user name
		user.setName(Validator.getString(scan, "\nEnter your name: "));

		// Collects opponent data
		playAgainst = Validator.getString(scan,
				"\nWould you like to play against The Eagles or The Patriots? (E/P): ",
				"E",
				"P");

		while (again.equalsIgnoreCase("y")) {
			// get user roshambo value
			user.setRoshambo(Validator.getRoshambo(scan, "\nRock, Paper, or scissors? (R/P/S): "));

			// sets opponent "player"
			if (playAgainst.equalsIgnoreCase("p")) {
				rival = new ThePatriots(); // rock
			} else {
				rival = new TheEagles(); // random
			}

			System.out.println();// new line
			System.out.println(user);
			System.out.println(rival);

			// print results
			int winner = getWinner(user.getRoshambo(), rival.getRoshambo());
			switch (winner) {
			case 0:
				System.out.println("Draw!");
				ties++;
				break;
			case 1:
				System.out.println(user.getName() + " wins!");
				wins++;
				break;
			case 2:
				System.out.println(rival.getName() + " win!");
				losses++;
				break;
			}

			// continue with another round?
			again = Validator.getString(scan, "\nPlay again? (y/n): ", "y", "n");
		}
		System.out.println("Thanks for playing! Wins: " + wins + " Losses: " + losses + " Ties: " + ties);

	}

	// method to generate the winner in 0 (tie), 1 (player1), 2 (player2)
	public static int getWinner(Roshambo player1, Roshambo player2) {
		if (player1 == player2) {
			return 0;
		} else if (player1 == Roshambo.rock) {
			if (player2 == Roshambo.paper) {
				return 2;
			} else
				return 1;
		} else if (player1 == Roshambo.paper) {
			if (player2 == Roshambo.scissors) {
				return 2;
			} else
				return 1;
		} else {
			if (player2 == Roshambo.rock) {
				return 2;
			} else
				return 1;
		}
	}

}
