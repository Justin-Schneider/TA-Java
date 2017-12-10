
public class Square {

	private int Length;

	public Square() {
		this.Length = 1;
	}

	public Square(int length) {
		Length = length;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) throws DimensionException{
		if(length > 0 ) Length = length;
		else throw new DimensionException("Invalid Dimension");
	}
	
	public void draw()
	{
		for(int i = 0; i < this.getLength(); i++)
		{
			for(int j = 0; j < this.getLength(); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getArea()
	{
		return this.Length * this.Length;
	}
	
	public int getPerimeter()
	{
		return this.Length * 4;
	}
	
	
	
}
