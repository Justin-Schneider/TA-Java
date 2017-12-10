import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int lengthOfMatrixOne = 0;
		int heightOfMatrixOne = 0;
		int lengthOfMatrixTwo = 0;
		int heightOfMatrixTwo = 0;
		int[][] matrixOne;
		int[][] matrixTwo;
		int[][] matrixFinal;
		
		System.out.println("Welcome to the matrix subtractin program.");
		System.out.println("Please enter the legnth of the first matrix");
		lengthOfMatrixOne = keyboard.nextInt();
		System.out.println("Please enter the height of the first matrix");
		heightOfMatrixOne = keyboard.nextInt();
		System.out.println("Please enter the legnth of the two matrix");
		lengthOfMatrixTwo = keyboard.nextInt();
		System.out.println("Please enter the height of the two matrix");
		heightOfMatrixTwo = keyboard.nextInt();
		System.out.println();
		
		if((lengthOfMatrixOne != lengthOfMatrixTwo) || (heightOfMatrixOne != heightOfMatrixTwo)) {
			System.out.println("Cannot subtract these! Dimension mismatch!");
			System.exit(0);
		}
			
		matrixOne = new int[heightOfMatrixOne][lengthOfMatrixOne];
		matrixTwo = new int[heightOfMatrixTwo][lengthOfMatrixTwo];
		matrixFinal = new int[heightOfMatrixOne][lengthOfMatrixOne];
		
		//Take in UserInput and populate both Arrays
		for(int i = 0; i < heightOfMatrixOne; i++)
		{
			for(int j = 0; j < lengthOfMatrixOne; j++)
			{
				System.out.println("Please enter a value for matrix 1 space " + (i+1) + ", " + (j+1));
				matrixOne[i][j] = keyboard.nextInt();
			}
		}
		System.out.println();
		for(int i = 0; i < heightOfMatrixTwo; i++)
		{
			for(int j = 0; j < lengthOfMatrixTwo; j++)
			{
				System.out.println("Please enter a value for matrix 2 space " + (i+1) + ", " + (j+1));
				matrixTwo[i][j] = keyboard.nextInt();
			}
		}
		System.out.println();
		
		//Print both Arrays
		for(int i = 0; i < heightOfMatrixOne; i++)
		{
			for(int j = 0; j < lengthOfMatrixOne; j++)
			{
				System.out.print(matrixOne[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-");
		for(int i = 0; i < heightOfMatrixTwo; i++)
		{
			for(int j = 0; j < lengthOfMatrixTwo; j++)
			{
				System.out.print(matrixTwo[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=");
		for(int i = 0; i < heightOfMatrixOne; i++)
		{
			for(int j = 0; j < lengthOfMatrixOne; j++)
			{
				matrixFinal[i][j] = matrixOne[i][j] - matrixTwo[i][j];
				System.out.print(matrixFinal[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("DONE!");
		keyboard.close();
	}

}
