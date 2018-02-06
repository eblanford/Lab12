/*
 * Emily Blanford
 * Lab 12: Rock, Paper, Scissors
 * Practice creating an abstract superclass
 */

public abstract class Player {
	private String name;
	private Roshambo roshambo;

	// constructors
	public Player(String name, Roshambo roshambo) {
		this.name = name;
		this.roshambo = roshambo;
	}

	public Player() {

	}

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getRoshambo() {
		return roshambo;
	}

	public void setRoshambo(Roshambo roshambo) {
		this.roshambo = roshambo;
	}

	// abstract generateRoshambo class
	public abstract Roshambo generateRoshambo();
	
	// format output
	public String toString() {
		return name + ": " + roshambo.toString();
	}

}
