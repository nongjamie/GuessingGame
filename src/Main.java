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
		GuessingGame guessingGame = new GuessingGame(20); //Set UpperBound to be 20.
		GameConsole playingGame = new GameConsole();
		playingGame.play(guessingGame);
	}

}