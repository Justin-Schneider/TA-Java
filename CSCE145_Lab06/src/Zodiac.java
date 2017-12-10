import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int day = 0;
		int month = 0;
		
		System.out.println("What is your zodiac? Enter your birthday! Month followed by Day!");
		month = keyboard.nextInt();
		day = keyboard.nextInt();
		
		if((day > 31 || day < 1) || (month > 12 || month < 1))
		{
			System.out.println("That's an incorrect amount for days or months!");
			System.exit(0);
		}
	    
		if((month == 3 && day >= 21) || (month == 4 && day <= 19))
		{
			System.out.println("You are a Aries!");
		}
		
		//repeat
		
		keyboard.close();
	}

}
