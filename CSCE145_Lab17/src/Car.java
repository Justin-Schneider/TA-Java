
public class Car extends Vehicle {

	private double gasMileage;
	private int numberOfPassenagers;
	
	public Car() {
		super();
		this.gasMileage = 0.0;
		this.numberOfPassenagers = 0;
	}

	public Car(String manufacturersName, int numberOfCylinders, String ownersName, double gasMileage, int numberOfPassengers) {
		super(manufacturersName, numberOfCylinders, ownersName);
		this.gasMileage = gasMileage;
		this.numberOfPassenagers = numberOfPassengers;
	}

	public double getGasMileage() {
		return gasMileage;
	}

	public int getNumberOfPassenagers() {
		return numberOfPassenagers;
	}

	public void setGasMileage(double gasMileage) {
		this.gasMileage = gasMileage;
	}

	public void setNumberOfPassenagers(int numberOfPassenagers) {
		this.numberOfPassenagers = numberOfPassenagers;
	}
	
	@Override
	public boolean equals(Vehicle vehcile)
	{
		if(super.equals(vehcile) && 
				(((Car) vehcile).getGasMileage() == this.getGasMileage()) && 
				((Car) vehcile).getNumberOfPassenagers() == this.getNumberOfPassenagers()) 
			return true;
		else return false;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " " + this.getGasMileage() + " " + this.getNumberOfPassenagers();
	}
	
}
