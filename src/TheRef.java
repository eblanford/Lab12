import java.util.Scanner;

/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * this is the user input
 */
public class TheRef extends Player {

	// constructors
	public TheRef(String name) {
		super.setName(name);
		super.setRoshambo(generateRoshambo());
		// TODO Auto-generated constructor stub
	}

	public TheRef() {
		super();
	}

	// collects user roshambo values
	@Override
	public Roshambo generateRoshambo() {
		Scanner scan = new Scanner(System.in);
		Roshambo rosh = Validator.getRoshambo(scan, "\nRock, Paper, or scissors? (R/P/S): ");
		return rosh;
	}

}
