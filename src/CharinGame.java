import java.util.Random;
/**
 * CharinGame is a NumberGame that random number from 1 to upperBound.
 * @author Charin Tantrakul
 *
 */
public class CharinGame extends NumberGame{

		private int upperBound;
		private int secret;
		private int count = 0;
	
		/**
		 * Default of CharinGame .
		 */
		public CharinGame()
		{
			this(10);
		}
		
		/**
		 * Initialize a new default game.
		 * @param upperBound is upper bound of this game 
		 */
		public CharinGame(int upperBound)
		{
			this.upperBound = upperBound ;
			long seed = System.nanoTime();
			Random rand = new Random (seed);
			this.secret = rand.nextInt(upperBound)+1;
			super.setMessage("I'm thinking of number between 1 and "+upperBound);
		}
		
		/**
		 * Check number that user input with secret number.
		 * @param number is the user's guess.
		 * @return true if user's guess is correct.
		 */
		public boolean guess(int number){
			this.count++;
			if(number == this.secret){
				setMessage("You right!! The number is "+this.secret);
				return true;
			}
			if(number > this.secret){
				setMessage("Sorry, I think your number is too large");
			}
			if(number < this.secret){
				setMessage("Sorry, I think your number is too small");
			}
			return false;
		}
		
		/**
		 *Get upper bound of this game.
		 *@return Upper bound of this game.
		 */
		public int getUpperBound(){
			return this.upperBound;
		}
		
		/**
		 * Get the user's guess number of times.
		 * @return number of times that user use in guessing.
		 */
		public int getCount(){
			return this.count;
		}
		
		/**
		 * Print message that describe this game.
		 * @return String that describe this game.
		 */
		@Override
		public String toString(){
			return "Guess a secret number." ;
		}
		
}
