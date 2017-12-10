
public class AppleTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the apple tester");
		
		System.out.println("Creating a default apple");
		Apple appleOne = new Apple();
		System.out.println("Printing the default apple's value");
		System.out.println(appleOne.toString());
		System.out.println();
		
		System.out.println("Creating another apple");
		Apple appleTwo = new Apple();
		appleTwo.setType("Granny Smith");
		appleTwo.setWeight(0.75);
		appleTwo.setPrice(0.99);
		System.out.println("Printing the default apple's value");
		System.out.println(appleTwo.toString());
		System.out.println();
		
		System.out.println("Creating another apple");
		Apple appleFour = new Apple();
		appleFour.setType("Granny Smith");
		appleFour.setWeight(0.75);
		appleFour.setPrice(0.99);
		System.out.println("Printing the default apple's value");
		System.out.println(appleFour.toString());
		System.out.println("This Apple is the Equal to the previous Apple: " + appleFour.equals(appleTwo));
		System.out.println();
		
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple’s values to the following invalid values \"iPad\" 2.5 -200");
		Apple appleThree = new Apple();
		appleThree.setType("iPad");
		appleThree.setWeight(2.5);
		appleThree.setPrice(-200);
		System.out.println("Printing the default apple's value");
		System.out.println(appleThree.toString());
		System.out.println("");
		
		
		
	}

}
