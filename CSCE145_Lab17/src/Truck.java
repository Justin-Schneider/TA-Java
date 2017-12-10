
public class Truck extends Vehicle {

	private double loadCapacity;
	private double towingCapacity;
	
	public Truck() {
		super();
		loadCapacity = 0.0;
		towingCapacity = 0.0;
	}

	public Truck(String manufacturersName, int numberOfCylinders, String ownersName, double loadCapacity, double towingCapacity) {
		super(manufacturersName, numberOfCylinders, ownersName);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		if(loadCapacity > 0.0) this.loadCapacity = loadCapacity;
	}

	public void setTowingCapacity(double towingCapacity) {
		if(towingCapacity > 0.0) this.towingCapacity = towingCapacity;
	}
	
	@Override
	public boolean equals(Vehicle vehcile)
	{
		if(super.equals(vehcile) && 
				(((Truck) vehcile).getLoadCapacity() == this.getLoadCapacity()) && 
				((Truck) vehcile).getTowingCapacity() == this.getTowingCapacity()) 
			return true;
		
		else return false;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " " + this.getLoadCapacity() + " " + this.getTowingCapacity();
	}
	
	
}
