
public class Vehicle {

	private String ManufacturersName;
	private int NumberOfCylinders;
	private String OwnersName;
	
	public Vehicle() {
		ManufacturersName = "";
		NumberOfCylinders = 0;
		OwnersName = "";
	}

	public Vehicle(String manufacturersName, int numberOfCylinders, String ownersName) {
		ManufacturersName = manufacturersName;
		if(numberOfCylinders > 0) this.NumberOfCylinders = numberOfCylinders;
		OwnersName = ownersName;
	}

	public String getManufacturersName() {
		return ManufacturersName;
	}

	public int getNumberOfCylinders() {
		return NumberOfCylinders;
	}

	public String getOwnersName() {
		return OwnersName;
	}

	public void setManufacturersName(String manufacturersName) {
		ManufacturersName = manufacturersName;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		if(numberOfCylinders > 0) NumberOfCylinders = numberOfCylinders;
	}

	public void setOwnersName(String ownersName) {
		OwnersName = ownersName;
	}
	
	public boolean equals(Vehicle vehicle)
	{
		if((vehicle.getManufacturersName().equals(this.getManufacturersName())) && (vehicle.getNumberOfCylinders() == this.getNumberOfCylinders())) return true;
		else return false;
	}
	
	public String toString()
	{
		return this.getManufacturersName() + " " + this.getNumberOfCylinders() + " " + this.getOwnersName();
	}



	

	
	
}
