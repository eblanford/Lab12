/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * Random generated player
 */

public class TheEagles extends Player {

	// constructors
	public TheEagles() {
		super.setRoshambo(generateRoshambo());
		super.setName("The Eagles");
	}

	public TheEagles(String name, Roshambo roshambo) {
		super(name, roshambo);
	}

	// Randomly generates rock, paper or scissors
	public Roshambo generateRoshambo() {
		// Generates a random value 0, 1, 2
		int selectARoshambo = (int) (Math.random() * 3);
		// sets random to rock, paper or scissors
		switch (selectARoshambo) {
		case 0:
			return Roshambo.rock;
		case 1:
			return Roshambo.paper;
		case 2:
			return Roshambo.scissors;
		default:
			return Roshambo.paper;
		}

	}

}
