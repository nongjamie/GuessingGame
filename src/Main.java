/**
 * Game of guessing a secret number.
 * @author Sathira Kittisukmongkol
 *
 */

/**
 * This class is for user input the guess number.
 * @author Sathira Kittisukmongkol
 *
 */
public class Main {

	/**
	 * The main control of the game.
	 * @param args
	 */
	public static void main(String[]args){
		GuessingGame game = new GuessingGame(20); //Set UpperBound to be 20.
		GameConsole ui = new GameConsole();
		ui.play(game);
	}

}