import java.util.Scanner;


public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	// added validation to check between two options
	public static String getString(Scanner sc, String prompt, String opt1, String opt2) {
		boolean isValid = false;
		String s = "";
		while (isValid != true) {
			System.out.print(prompt);
			s = sc.next();
			sc.nextLine();
			if (s.equalsIgnoreCase(opt1)) {
				isValid = true;
			} else if (s.equalsIgnoreCase(opt2)) {
				isValid = true;
			} else {
				System.out.println("Invalid entry, try again! ");
			}
		}
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid entry, try again! ");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}

	// added to Validate that a valid roshambo value is entered
	public static Roshambo getRoshambo(Scanner sc, String prompt) {
		Roshambo playerChoice = Roshambo.rock;
		String rockPaperScissors;
		boolean isValid = false;
		while (isValid != true) {
			rockPaperScissors = getString(sc, prompt);
			if (rockPaperScissors.equalsIgnoreCase("r")) {
				playerChoice = Roshambo.rock;
				isValid = true;
			} else if (rockPaperScissors.equalsIgnoreCase("p")) {
				playerChoice = Roshambo.paper;
				isValid = true;
			} else if (rockPaperScissors.equalsIgnoreCase("s")) {
				playerChoice = Roshambo.scissors;
				isValid = true;
			} else {
				System.out.println("Invalid entry, try again! ");
			}
		}
		return playerChoice;
	}

}
