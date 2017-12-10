

public class SawLine implements Line {

	private double modValue;
	
	public SawLine() {
		this.modValue = 0.0;
	}
	
	public SawLine(double modValue)
	{
		this.modValue = modValue;
	}

	public double getModValue() {
		return modValue;
	}

	public void setModValue(double modValue) {
		this.modValue = modValue;
	}
	
	public double getYPoint(double x)
	{
		return (x % modValue);
	}
}
