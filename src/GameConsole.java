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
	public void play(GuessingGame game){
		Scanner input = new Scanner(System.in); //For input number from users.
		System.out.println(game.getHint()); //Print the initial hint of the game that in GuessingGame Class.
		int number=0; //To save the recent input number from users.
		boolean a=true; //To control the game to be in loop.
		while(a){
			System.out.print("What is your guess? ");
			int num = Integer.parseInt(input.nextLine());
			number = num;
			a = game.guess(num);
			a = !a; //Protect the game to exit the loop if input is not equals to secret.
			if(a){ //If the number is not correct.
				game.setHint(num); //To show hint.
				System.out.println(game.hint);
			}
		}
		System.out.print("Correct! The secret is "+number+". You used "+game.count+" guesses.");
	}

}
