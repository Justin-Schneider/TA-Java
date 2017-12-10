
public class ExponentialLine implements Line {

	private double exponent;
	
	public  ExponentialLine() {
		this.exponent = 0.0;
	}
	
	public  ExponentialLine(double exponent) {
		this.exponent = exponent;
	}

	public double getExponent() {
		return exponent;
	}

	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

	public double getYPoint(double x) {
		return Math.pow(x, exponent);
	}
	
	
}
