/**
 * Game of guessing a secret number.
 * @author Sathira Kittisukmongkol
 *
 */
import java.util.Random; //for random numbers

/**
 * This is GuessingGame Class that will send the answer.
 * @author Sathira Kittisukmongkol
 *
 */
public class GuessingGame {
	private int upperbound; //limit of the game.
	private int secret; //the random number that is the answer of the game.
	public String hint = "I'm thinking of number between 1 and 20.";
	public int count = 0; //for count the number of user's guesses.

	/**
	 * This is constructor.
	 * The UpperBound will be 20 and secret will be random between 1 to 20.
	 * @param upperbound of the game.
	 */
	public GuessingGame ( int upperbound ) { 
		this.upperbound = upperbound;
		this.secret = getRandomNumber( upperbound );
	}


	/**
	 * This method is to check input number , is it equals to secret? ,and count the time of guesses by count variable.
	 * @param number that comes from the GameConsole Class  and play method.
	 * @return true if input is equal to secret and false if input is not equal to secret.
	 */
	public boolean guess ( int number ) { //to check input number from user is correct on not
		if (number == secret) {
			count++; // add count by 1 for each time that call this method
			return false;
		}
		else {
			count++;
			return true;

		}
	}

	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * Return a number of count based on the most recent guess.
	 * @return a number of count based on most recent guess
	 */
	public int getCount() {
		return count;
	}

	/**
	 * This method is to send hint depends on the input number from the user
	 * @param number that from input number of user
	 */
	protected void setHint( int number ) {
		if (number < secret) {
			this.hint = "Sorry, too small.";
		}
		else if (secret < number) {
			this.hint = "Sorry, too big.";
		}
		else{
		}
	}

	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber( int limit ) {
		long seed = System.currentTimeMillis();
		Random rand = new Random( seed );
		return rand.nextInt( limit ) + 1;
	}

}
