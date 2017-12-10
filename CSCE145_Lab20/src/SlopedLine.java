
public class SlopedLine implements Line {

	private double slope;
	
	public SlopedLine() {
		this.slope = 0.0;
	}
	
	public SlopedLine(double slope)
	{
		this.slope = slope;
	}

	public double getSlope() {
		return slope;
	}

	public void setSlope(double slope) {
		this.slope = slope;
	}

	public double getYPoint(double x)
	{
		return (slope*x);
	}
	
}
