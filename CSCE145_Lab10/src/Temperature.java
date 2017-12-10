import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double[] temperature = new double[10];
		double average = 0.0;
		
		System.out.println("Welcome to the above average temperature tester program.");
		for(int i = 0; i < temperature.length; i++)
		{
			System.out.println("Please enter the remperature for day " +  (i + 1));
			temperature[i] = keyboard.nextDouble();
			average += temperature[i];
		}
		keyboard.nextLine();
		
		average /= temperature.length;
		System.out.println("The average temperature was " + average);
		System.out.println("The days that were above average were");
		
		for(int i = 0; i < temperature.length; i++)
		{
			if(temperature[i] > average) System.out.println("Day " + (i + 1) + " with " + (int)temperature[i]);
		}
		keyboard.nextLine();
		
		System.out.println("Done!");
		keyboard.close();
	}
}
