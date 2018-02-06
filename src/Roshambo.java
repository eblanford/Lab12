/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * Roshambo enumeration
 */
public enum Roshambo {
	rock, paper, scissors;

	public String toString() {
		switch (this) {
		case rock:
			return "rock";
		case paper:
			return "paper";
		case scissors:
			return "scissors";
		default:
			throw new IllegalArgumentException();
		}
	}
}


