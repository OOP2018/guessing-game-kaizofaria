/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 2;
		NumberGame game = new CharinGame(upperBound);
		GameConsole ui = new GameConsole( );
		// this variable use to run GameSolver
		GameSolver bot = new GameSolver();
		//if you want to test GameSolver 
		//Just change ui.play(game) to bot.play(game)
		int solution = bot.play( game);
		System.out.println("The secret number is "+solution);
		System.out.println("How many time that user guess the number?");
		System.out.println(game.getCount());
	}
}
