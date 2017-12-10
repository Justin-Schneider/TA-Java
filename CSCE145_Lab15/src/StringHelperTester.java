
public class StringHelperTester {

	public static void main(String[] args) {

		System.out.println("Welcome to the String Helper Tester");
		
		System.out.println("Meshing harp with fiddle");
		System.out.println(StringHelper.meshStrings("fiddle", "a"));
		
		System.out.println("Replacing vowels with oodle in the word burrito");
		System.out.println(StringHelper.replaceVowelsWithOodle("BURRITO"));
		
		System.out.println("The weight of the word taco is");
		System.out.println(StringHelper.weight("taco"));
	}

}
