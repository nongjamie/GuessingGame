/**
 * Game of guessing a secret number.
 * @author Sathira Kittisukmongkol
 *
 */
import java.util.Scanner; // To get the input number from user.

/**
 * This class works between Main Class and GuessingGame Class.
 * @author Sathira Kittisukmongkol
 *
 */
public class GameConsole {

	/**
	 * This method is the control of the game.
	 * @param game , object in GuessingGame Class , to connect with it.
	 */
	public void play(GuessingGame game) {
		//For input number from users.
		Scanner input = new Scanner(System.in);
		//Print the initial hint of the game that in GuessingGame Class.
		System.out.println( "I'm thinking of number between 1 and "+game.getUpperBound()+"." ); 
		//To save the recent input number from users.
		int ansNumber = 0; 
		//To control the game to be in loop.
		boolean controller = true; 
		while( controller ) {
			System.out.print( "What is your guess? " );
			int num = Integer.parseInt( input.nextLine() );
			ansNumber = num;
			controller = game.guess( num );
			//If the number is not correct.
			if ( controller ) { 
				//To show hint.
				game.setHint( num ); 
				System.out.println( game.hint );
			}
		}
		System.out.print( "Correct! The secret is "+ansNumber+". You used "+game.count+" guesses." );
	}

}
