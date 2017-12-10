import java.util.Scanner;

public class BoxSorter {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			Box[] myBoxes = new Box[2];
		
			System.out.println("Welcome to the box sorter!");
			System.out.println("Enter the information aobut boxes and I'll sort them!");
			
			for(int i = 0; i < myBoxes.length; i++)
			{
				System.out.println("Enter the laber, length, width, and height (all feet) of box " + (i+1));
				myBoxes[i] = new Box(keyboard.nextLine(), keyboard.nextDouble(), keyboard.nextDouble(), keyboard.nextDouble());
			}
			
			System.out.println("Sorted Boxes");
			BubbleSort(myBoxes);
			printBoxes(myBoxes);
			keyboard.close();
	}

	public static void BubbleSort(Box box[])
	{
		for(int i = 0; i < box.length - 1; i++)
		{
			for(int j = 0; j < box.length - i - 1; j++)
			{
				if(box[j].getVolume() > box[j+1].getVolume()) {
					Box temp = box[j];
					box[j] = box[j+1];
					box[j+1] = temp;
				}
			}
		}
	}
	
	public static void printBoxes(Box box[]) {
		for(int i = 0; i < box.length; i++)
		{
			System.out.println(box[i].toString());
		}
	}
}
