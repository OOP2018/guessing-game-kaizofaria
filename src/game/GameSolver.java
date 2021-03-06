package game;

import java.util.Random;
/**
 * Automatically find the secret to any NumberGame
 * @author Charin Tantrakul
 *
 */
public class GameSolver {
	
	/**
	 * Solve NumberGame.
	 * @param game is NumberGame. 
	 * @return solution of NumberGame
	 */
	public int play(NumberGame game){
		//Create guess number.
		long seed =System.nanoTime();
		Random rand = new Random(seed);
		//
		boolean correct = false;
		//Solution of NumberGame.
		int solution=0;
		//Maximum of range that use to random the guess number.
		int max_random = game.getUpperBound();
		//Minimum of range that use to random the guess number.
		int min_random = 1;
		int guess_number = rand.nextInt((max_random-min_random)+1)+min_random;
		
		// describe the game
		System.out.println( game.toString() );
		System.out.println( game.getMessage() );	
		
		//Guess the number by random.
		//If guess number is too large.It will be maximum of random  next time. 
		//If guess number is too small.It will be minimum of random  next time.
		while(correct == false){
			solution = guess_number ;
			correct = game.guess(solution);
			if(game.getMessage().contains("too large")){
				max_random = solution-1;
				guess_number  = rand.nextInt((max_random-min_random)+1)+min_random;
			}
			if(game.getMessage().contains("too small")){
				min_random = solution+1;
				guess_number  = rand.nextInt((max_random-min_random)+1)+min_random;
			}
		}
		return solution;
	}
}
