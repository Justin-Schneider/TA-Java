
public class Apple {
	private String type;
	private double weight;
	private double price;
	
	public Apple()
	{
		type = "Gala";
		weight = 0.5;
		price = 0.89;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if(type == "Red Delicious" || type == "Golden Delicious" || type == "Gala" || type == "Granny Smith") this.type = type;
		else System.out.println("Invalid Name");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight > 2 || weight < 0) System.out.println("Invalid Weight");
		else this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) System.out.println("Invalid Price");
		else this.price = price;
	}
	
	public String toString() {
		return "Name : " + this.type + " Weight " + this.weight + " Price " + this.price;
	}
	
	public boolean equals(Apple apple) {
		if(apple.price == this.price && apple.weight== this.weight && apple.weight == this.weight) {
			return true;
		}
		else return false;
	}
}
