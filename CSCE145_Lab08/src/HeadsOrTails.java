//import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HeadsOrTails {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//Random rand = new Random();
		
		int numberOfFlips = 0;
		int heads = 0;
		int tails = 0;
		int n = 0;
		
		System.out.println("Welcome to the heads or tails simulator!");
		System.out.println("Enter a number to flip!");
		numberOfFlips = keyboard.nextInt();
		
		for(int i = 0; i < numberOfFlips; i++)
		{
			//rand.nextInt(2); 
			//(int) Math.round(Math.random());
			//(int) Math.random() * 2;
			//
			n = ThreadLocalRandom.current().nextInt(2);
			if(n == 1) {
				tails += 1;
				System.out.println("Tails!");
			}
			if(n == 0) {
				heads += 1;
				System.out.println("Heads!"); 
			}
		}
		
		System.out.println("The number of heads was " + heads);
		System.out.println("The number of tails was " + tails);
		
		if(heads > tails) System.out.println("Heads wins!");
		else if(tails > heads) System.out.println("Tails wins!");
		else System.out.println("They tied!");
		keyboard.close();
	}

}
