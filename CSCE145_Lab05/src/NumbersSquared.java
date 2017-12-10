import java.util.Scanner;

//Justin Schneider
public class NumbersSquared {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String myNumber = null;
		String reverse = null;
		
		System.out.println("Enter a four digit number.");
		myNumber = keyboard.nextLine();
		reverse = new StringBuilder(myNumber).reverse().toString();
		
		
		System.out.println(myNumber + '\n'  +
						   myNumber.charAt(1) + " " + " " + myNumber.charAt(2) + '\n' +
						   myNumber.charAt(2) + " " + " " + myNumber.charAt(1) + '\n' +
						   reverse
				);
		
		for(int i = myNumber.length() - 1; i >= 0; i--)
		{
			System.out.print(myNumber.charAt(i));
		}
		
		
		keyboard.close();
	}

}
