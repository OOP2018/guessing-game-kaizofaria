import java.util.Random;
/**
 * Automatically find the secret to any NumberGame
 * @author kaizofaria
 *
 */
public class GameSolver {
		
	public int play(NumberGame game){
		long seed =System.nanoTime();
		Random rand = new Random(seed);
		boolean correct = false;
		int guess_number=0;
		int max_random = game.getUpperBound();
		int min_random = 1;
		int answer = rand.nextInt((max_random-min_random))+min_random;
		// describe the game
		System.out.println( game.toString() );
		System.out.println( game.getMessage() );		
		while(correct == false){
			System.out.println("Your answer? ");
			System.out.println(guess_number);
			guess_number = answer;
			correct = game.guess(guess_number);
			System.out.println( game.getMessage() );
			if(game.getMessage().contains("large")){
				max_random = guess_number;
				answer = rand.nextInt((max_random-min_random))+min_random;
			}
			if(game.getMessage().contains("small")){
				min_random = guess_number;
				answer = rand.nextInt((max_random-min_random))+min_random;
			}
		}
		return guess_number;
	}
}
