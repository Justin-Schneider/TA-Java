
public class SineLine implements Line {

	private double amplitude;
	private double frequency;
	
	public SineLine()
	{
		this.amplitude = 0;
		this.frequency = 0;
	}
	
	public SineLine(double amplitude, double frequency)
	{
		this.amplitude = amplitude;
		this.frequency = frequency;
	}
	
	public double getAmplitude() {
		return amplitude;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setAmplitude(double amplitude) {
		this.amplitude = amplitude;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public double getYPoint(double x) {
		return (amplitude*(Math.sin(x*frequency)));
	}

}
