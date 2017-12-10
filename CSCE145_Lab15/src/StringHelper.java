
public class StringHelper {

	public static String meshStrings(String one, String two)
	{
		String meshedStrings = "";
		for(int i = 0; i < (one.length() + two.length()); i++) {
			if( i < one.length() ) meshedStrings += one.charAt(i);
			if( i < two.length() ) meshedStrings += two.charAt(i);
		}
		return meshedStrings;
	}
	
	public static String replaceVowelsWithOodle(String one)
	{
		return one.replaceAll("[aeiouAEIOU]", "oodle");
	}
	
	public static double weight(String one)
	{
		double weight = 0.0;
		for(int i = 0; i < one.length(); i++)
		{
			if(Character.toLowerCase(one.charAt(i)) == 'a' || 
			   one.charAt(i) == 'e' ||
			   one.charAt(i) == 'i' ||
			   one.charAt(i) == 'o' ||
			   one.charAt(i) == 'u') weight += 2.5;
			else weight += 3.4;
		}
		return weight;
	}
}
