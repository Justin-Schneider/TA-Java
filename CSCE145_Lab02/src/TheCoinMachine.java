import java.util.Scanner;

//Justin Schneider


public class TheCoinMachine {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int numberOfCoins = 0;
		int numberOfQuarters = 0;
		int numberOfDimes = 0;
		int numberOfNickels = 0;
		int numberOfPennies = 0;
		int OrginalNumberOfCoins = 0;
		
		System.out.println("Enter a whole number from 1 to 99.");
		numberOfCoins = keyboard.nextInt();
		OrginalNumberOfCoins = numberOfCoins;
		System.out.println("The machine will determine a combination of coins.");
		
		numberOfQuarters = numberOfCoins / 25;
		numberOfCoins = numberOfCoins % 25;
		
		numberOfDimes = numberOfCoins / 10;
		numberOfCoins = numberOfCoins % 10;
		
		numberOfNickels = numberOfCoins / 5;
		numberOfCoins = numberOfCoins % 5;
		
		numberOfPennies = numberOfCoins / 1;
		numberOfCoins = numberOfCoins % 1;
		
		System.out.println(OrginalNumberOfCoins + " cents in coins: " + "\n" +
				           "\t" + numberOfQuarters + " Quarters" + "\n" +
				           "\t" + numberOfDimes + " Dimes" + "\n" +
				           "\t" + numberOfNickels + " Nickels" + "\n" +
				           "\t" + numberOfPennies + " Pennies" + "\n"
				);
		
		keyboard.close();
	}

}
