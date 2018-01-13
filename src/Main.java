/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new CharinGame(upperBound);
		GameConsole ui = new GameConsole( );
		// this variable use to run GameSolver
		GameSolver bot = new GameSolver();
		int solution = bot.play( game);
		System.out.println("play() returned "+solution);
		System.out.println("How many time that user guess the number?");
		System.out.println(game.getCount());
	}
}
