
public class StaircaseLine implements Line {

	private double width;
	private double height;
	
	public StaircaseLine()
	{
		this.width = 0.0;
		this.height = 0.0;
	}
	
	public StaircaseLine(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getYPoint(double x)
	{
		if( x % 2 == 1) return ((x-1)/(width))*height;
		else return (x/(width))*(height);
	}
}
