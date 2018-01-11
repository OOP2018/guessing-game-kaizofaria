import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		boolean correct = false;
		int guess_number=0;
		// describe the game
		System.out.println( game.toString() );
		System.out.println( game.getMessage() );		
		while(correct == false){
			System.out.print("Your answer? ");
			guess_number = console.nextInt();
			correct = game.guess(guess_number);
			System.out.println( game.getMessage() );
		}
		return guess_number;
	}
	
}
