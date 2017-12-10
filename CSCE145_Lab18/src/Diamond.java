
public class Diamond extends ShapeBasics implements DiamondInterface {

	private int width;

	public Diamond() {
		this.width = 0;
	}

	public Diamond(int width, int offset) {
		this.width = width;
		this.setOffset(offset);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width % 2 == 1) this.width = width;
	}

	@Override
	public void drawHere()
    {
		this.drawTopV();
		this.drawBottomV();
    }
	
	private void drawTopV()
	{
		int temp = 0;
		for(int i = 0; i < (this.getWidth()/2); i++) {
			for (int count = 0; count < this.getOffset(); count++)
			{
				 System.out.print(' ');
			}
			if( temp < 1) temp += i;
			else temp += 2;
			skipSpaces(this.getWidth()/2 - i);
			System.out.print("*");
			skipSpaces(temp);
			if(i > 0) System.out.print("*");
			skipSpaces(this.getWidth()/2 - i);
			System.out.println();
			
		}
	}
	
	private void drawBottomV()
	{
		int temp = 0;
		int temp2 = this.getWidth() - 2;
		for(int i = (this.getWidth()/2); i >= 0; i--) {
			for (int count = 0; count < this.getOffset(); count++)
			{
				 System.out.print(' ');
			}
			skipSpaces(temp);
			System.out.print("*");
			skipSpaces(temp2);
			if(i != 0) System.out.print("*");
			skipSpaces(temp);
			temp += 1;
			temp2 -= 2;
			System.out.println();
		}
	}
	
	public static void skipSpaces(int spaces)
	{
		for(int i = 0 ; i < spaces; i++)
		{
			System.out.print(" ");
		}
	}
}
