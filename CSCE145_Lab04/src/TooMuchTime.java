import java.util.Scanner;

//justin schneider
public class TooMuchTime {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String time = null;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		int moreSeconds = 0;
		
		System.out.println("Enter a time in the following format \"hours:minutes:seconds\" and I will give you the time in seconds.");
		time = keyboard.nextLine();
		
		hours = Integer.parseInt(time.substring(0,2));
		minutes = Integer.parseInt(time.substring(3,5));
		seconds = Integer.parseInt(time.substring(6,8));
		
		hours *= 60;      
		minutes = (minutes + hours) * 60;    
		seconds += minutes;
		
		System.out.println("The number of seconds are " + seconds 
				 		   + "\n" +
						   "Enter a number of seconds to add");
		moreSeconds = keyboard.nextInt();
		
		seconds += moreSeconds;
		minutes = (seconds/60);
		hours = minutes/60;
		minutes %= 60;
		seconds %= 60;
		
		System.out.println("The new time is " + hours + ":" + minutes + ":" + seconds);
		keyboard.close();
	}
}
