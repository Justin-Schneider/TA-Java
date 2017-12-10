import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AEIOUCounter2 {

	public static void main(String[] args) {
		try(Scanner input = new Scanner(new File("blah.txt")))
		{
			int count = 0;
			while(input.hasNextLine())
			{
				String line = input.nextLine().replaceAll("[^aeiouAEIOU ]", "").toLowerCase();
				for(int i = 0 ; i < line.length(); i++) {
					if(line.contains("aeiou"))
					{
						int index = line.indexOf("u");
						line = line.substring(index + 1);
						count++;
					}
				}
			}
			System.out.println("The file blah.txt has \"AEIOU\" in order " + count + " times");
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
