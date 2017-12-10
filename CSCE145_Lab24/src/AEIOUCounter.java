import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AEIOUCounter {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(new File("blah.txt")))
		{
			int count = 0;
			while(input.hasNextLine())
			{
				String line = input.nextLine().replaceAll("[^aeiouAEIOU ]", "").toLowerCase();
				for(int i = 0; i < line.length(); i++)
				{
					if(line.charAt(i) == 'a')
					{
						for(int j = i + 1; j < line.length(); j++)
						{
							if(line.charAt(j) == 'e' )
							{
								for(int k = j + 1; k < line.length(); k++)
								{
									if(line.charAt(k) == 'i')
									{
										for(int l = k + 1; l < line.length(); l++)
										{
											if(line.charAt(l) == 'o')
											{
												for(int m = l + 1; m < line.length(); m++)
												{
													if(line.charAt(m) == 'a' || line.charAt(m) == 'e' || line.charAt(m) == 'i' || line.charAt(m) == 'o' )
													{
														i = m + 1;
														break;
													}
													else if(line.charAt(m) == 'u'){
														count++;
														System.out.println(line.substring(i,m+1));
														i = m + 1;
														break;
													}
												}
												break;
											}
										}
										break;
									}
								}
								break;
							}
						}
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
