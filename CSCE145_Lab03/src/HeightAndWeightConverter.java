//Justin Schneider
import java.util.Scanner;

public class HeightAndWeightConverter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double weight = 0;
		double height = 0;
		double kilograms = 0;
		double stones = 0;
		double slugs = 0;
		double pennyweights = 0;
		double grains = 0;
		double meters = 0;
		double hands = 0;
		double furlongs = 0;
		double cubits = 0;
		double rackUnits = 0;
		
		System.out.println("Welcome to the weight and height converter 9000!");
		System.out.println("Enter a weight in pounds.");
		weight = keyboard.nextInt();
		System.out.println("Enter a height in feet.");
		height = keyboard.nextInt();
		
		kilograms = weight * 0.456;
		stones = weight * 0.071;
		slugs = weight * 0.031;
		pennyweights = weight * 291.667;
		grains = weight * 7000;
		
		meters = height * 0.305;
		hands  = height * 3;
		furlongs = height * 0.002;
		cubits = height * 0.667;
		rackUnits = height * 6.857;
		
		
		System.out.println( 
				  weight + "lbs is " + kilograms + " kilograms" + '\n'
				+ weight + "lbs is " + stones + " stones" + '\n'
				+ weight + "lbs is " + slugs + " slugs" + '\n'
				+ weight + "lbs is " + pennyweights + " pennyweights" + '\n'
				+ weight + "lbs is " + grains + " grains" + '\n'
				+ height + " feet is " + meters + " meters" + '\n'
				+ height + " feet is " + hands + " hands" + '\n'
				+ height + " feet is " + furlongs + " furlongs" + '\n'
				+ height + " feet is " + cubits + " cubits" + '\n'
				+ height + " feet is " + rackUnits + " rackUnits" + '\n'
				);
		
		keyboard.close();
	}

}
