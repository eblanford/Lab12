/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * this is the user input
 */
public class TheRef extends Player {

	// constructors
	public TheRef(String name, Roshambo roshambo) {
		super(name, roshambo);
		// TODO Auto-generated constructor stub
	}

	public TheRef() {
		super();
	}

	// didn't end up calling this, collected user input from the main
	@Override
	public Roshambo generateRoshambo(Roshambo roshambo) {
		return roshambo;
	}

}
