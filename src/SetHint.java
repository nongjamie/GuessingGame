/**
 * Game of guessing a secret number.
 * @author Sathira Kittisukmongkol
 *
 */
//import Random package to random the number.
import java.util.Random;

/**
 * This class is set the secret number.
 * @author Sathira Kittisukmongkol
 */
public class SetHint {
	//Variable to save the secret number.
	private int hint;

	/**
	 * This is constructor.
	 * It will random the number between 0 to 1,000.
	 */
	public SetHint() {
		Random randomObject = new Random();
		int randomNumber = randomObject.nextInt( 1000 );
		hint = randomNumber;
	}
	
	/**
	 * This method will send the secret number.
	 * @return hint , the secret number.
	 */
	public int getHint() {
		return hint;
	}
	
}
