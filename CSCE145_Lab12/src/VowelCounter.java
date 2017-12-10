import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String userInput;
		int intTemp = 0;
		char charTemp;
		char[] vowels =  {'a','e','i','o','u'};
		int[] count = new int[vowels.length];
		
		System.out.println("Welcome to the vowel counter and sorter!");
		System.out.println("Enter a pharse!");
		userInput = keyboard.nextLine().toLowerCase();
		
		for(int i = 0; i < userInput.length(); i++)
		{
			switch(userInput.charAt(i)) {
			case 'a': count[0]++;
			  		  break;
			case 'e': count[1]++;
			          break;
			case 'i': count[2]++;
			          break;
			case 'o': count[3]++;
			          break;
			case 'u': count[4]++;
			          break;
			}
		}
		
		for(int i = 0; i < count.length; i++)
		{
			for(int j = 1; j < count.length - i; j++)
				if(count[j-1] > count [j])
				{
					intTemp = count[j-1];
					count[j-1] = count[j];
					count[j] = intTemp;
					charTemp = vowels[j-1];
					vowels[j-1] = vowels[j];
					vowels[j] = charTemp;
				}
		}
		
		System.out.println("The vowels and their count");
		for(int i = 0; i < vowels.length; i++)
		{
			System.out.println(vowels[i] + " " + count[i]);
		}
		
		keyboard.close();
	}

}
