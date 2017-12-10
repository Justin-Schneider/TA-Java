
public class DimensionException extends Exception {

	public DimensionException()
	{
		super();
		System.out.println("Invalid Dimension");
	}
	public DimensionException(String s)
	{
		super(s);
	}
}
