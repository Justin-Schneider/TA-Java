import java.util.Scanner;

public class BMRCalc {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String gender = null;
		String lifeStyleChoice = null;
		int height = 0;
		int weight = 0;
		int age = 0;
		double BMR = 0;
		
		System.out.println("Welcome to the BMR calculator!");
		System.out.println("Frist are you male or female? Enter M or F.");
		gender = keyboard.nextLine().toLowerCase().replaceAll("\\s+", "");
		System.out.println("How tall are you in inches?");
		height = keyboard.nextInt();
		System.out.println("What is your weight in pounds?");
		weight = keyboard.nextInt();
		System.out.println("What is your age in years?");
		age = keyboard.nextInt();
		keyboard.nextLine();
		
		if(gender.equals("m")) BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		else if(gender.equals("f")) BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		
		System.out.println("How would you describe your lifestyle? Sedentary, Somewhat Active, Active, or Highly Active?");
		lifeStyleChoice = keyboard.nextLine().toLowerCase().replaceAll("\\s+", "");
		
		switch(lifeStyleChoice) {
			case "sedentary": BMR += (BMR * .20);
							  System.out.println("Your BMR is " + BMR + " calories!");
							  break;
			case "somewhatactive": BMR += (BMR * .30);
			                       System.out.println("Your BMR is " + BMR + " calories!");
								   break;
			case "active": BMR += (BMR * .40);
			               System.out.println("Your BMR is " + BMR + " calories!");
				  		   break;
			case "highlyactive": BMR += (BMR * .50);
			                     System.out.println("Your BMR is " + BMR + " calories!");
						         break;
		}
		
		keyboard.close();
	}
}
