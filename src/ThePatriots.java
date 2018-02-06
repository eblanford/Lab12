/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * Rock Player
 */

public class ThePatriots extends Player {

	// constructors
	public ThePatriots() {
		super.setName("The Patriots");
		super.setRoshambo(generateRoshambo());

	}

	public ThePatriots(String name, Roshambo roshambo) {
		super(name, roshambo);
		// TODO Auto-generated constructor stub
	}

	// input not needed for this object -> always rock
	@Override
	public Roshambo generateRoshambo() {
		// Always returns rock
		return Roshambo.rock;
	}

}
