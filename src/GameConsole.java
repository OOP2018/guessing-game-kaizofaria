import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 *  @author Charin Tantrakul
 */
public class GameConsole {

	/**
	 * play the game
	 * @param game any NumberGame
	 * @return guess_number or user's input that correct.
	 */
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
