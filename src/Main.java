/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 50;
		NumberGame game = new CharinGame(upperBound);
		GameConsole ui = new GameConsole( );
		//GameSolver bot = new GameSolver();
		int solution = ui.play( game );
		//TODO display the answer returned by play
		System.out.println("play() returned "+solution);
		//TODO display how many guesses the user made
		System.out.println("How many time that user guess the number?");
		System.out.println(game.getCount()+1);
	}
}
