import java.io.*;
import java.util.*;
public class SalaryAnalyzer {
	static final String IN_FILE_NAME = "StateOfSC-Salary-List-04012015.txt";
	static final String OUT_FILE_NAME = "OVER250000.txt";
	static final String DELIM = "\t";
	public static void main(String[] args)
	{
		System.out.println("Let's see how many state employees make over $250,000 and work at USC.");
		analyzeEmployeeFile(IN_FILE_NAME);
		System.out.println("Results have been printed to "+OUT_FILE_NAME);
	}
	public static void analyzeEmployeeFile(String fileName)
	{
		try(Scanner input = new Scanner(new File(IN_FILE_NAME))) {
			String line = null;
			int income = 0;
			int index = 0;
			while(input.hasNext())
			{
				line = input.nextLine();
				if(line.contains("UNIVERSITY OF SOUTH CAROLINA"))
				{
					index = line.lastIndexOf(DELIM);
					income = Integer.parseInt(line.substring(index + 1));
					if(income > 250000)
					{
						System.out.println(line);
						printToSalaryFile(OUT_FILE_NAME, line);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void printToSalaryFile(String fileName, String text)
	{
		try(FileWriter writer = new FileWriter(fileName, true)){
			writer.write(text + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}