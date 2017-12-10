import java.util.Scanner;

public class TriangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int triangleSize = 0;
		
		System.out.println("Welcome to Triangle Maker 9000! Enter the size of the triangle.");
		triangleSize = keyboard.nextInt();
		
		for(int i = 0; i < triangleSize; i++) {
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = triangleSize; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		keyboard.close();
	}

}
