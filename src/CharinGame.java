import java.util.Random;

public class CharinGame extends NumberGame{

		private int upperBound;
		private int secret;
		private int count = 0;
		
		public CharinGame()
		{
			this(10);
		}
		
		public CharinGame(int upperBound)
		{
			this.upperBound = upperBound ;
			long seed = System.nanoTime();
			Random rand = new Random (seed);
			this.secret = rand.nextInt(upperBound)+1;
			super.setMessage("I'm thinking of number between 1 and "+upperBound);
		}
		
		
		public boolean guess(int number){
			if(number == this.secret){
				setMessage("You right!! The number is "+this.secret);
				return true;
			}
			if(number > this.secret){
				setMessage("Sorry, I think your number is too large");
				this.count++;
			}
			if(number < this.secret){
				setMessage("Sorry, I think your number is too small");
				this.count++;
			}
			return false;
		}
		
		public int getUpperBound(){
			return this.upperBound;
		}
		
		public int getCount(){
			return this.count;
		}
		
		@Override
		public String toString(){
			return "Guess a secret number." ;
		}
		
}
