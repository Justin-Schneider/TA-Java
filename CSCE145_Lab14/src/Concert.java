
public class Concert {

	private String name; 
	private int capacity;
	private int numberOfTicketsSoldByPhone;
	private int numberOfTicketsSoldAtVenue;
	private double priceByPhone;
	private double priceAtVenue;
	
	public Concert() {
		name = null;
		capacity = 0;
		numberOfTicketsSoldByPhone = 0;
		numberOfTicketsSoldAtVenue = 0;
		priceByPhone = 0;
		priceAtVenue = 0;
	}
	
	public Concert(String name, int capacity, double priceByPhone, double priceAtVenue) {
		this.name = name;
		this.capacity = capacity;
		this.priceByPhone = priceByPhone;
		this.priceAtVenue = priceAtVenue;
	}

	public Concert(String name, int capacity, int numberOfTicketsSoldByPhone, int numberOfTicketsSoldAtVenue,
			double priceByPhone, double priceAtVenue) {
		this.name = name;
		this.capacity = capacity;
		this.numberOfTicketsSoldByPhone = numberOfTicketsSoldByPhone;
		this.numberOfTicketsSoldAtVenue = numberOfTicketsSoldAtVenue;
		this.priceByPhone = priceByPhone;
		this.priceAtVenue = priceAtVenue;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getNumberOfTicketsSoldByPhone() {
		return numberOfTicketsSoldByPhone;
	}

	public int getNumberOfTicketsSoldAtVenue() {
		return numberOfTicketsSoldAtVenue;
	}

	public double getPriceByPhone() {
		return priceByPhone;
	}

	public double getPriceAtVenue() {
		return priceAtVenue;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setNumberOfTicketsSoldByPhone(int numberOfTicketsSoldByPhone) {
		this.numberOfTicketsSoldByPhone += numberOfTicketsSoldByPhone;
	}

	public void setNumberOfTicketsSoldAtVenue(int numberOfTicketsSoldAtVenue) {
		this.numberOfTicketsSoldAtVenue += numberOfTicketsSoldAtVenue;
	}

	public void setPriceByPhone(double priceByPhone) {
		this.priceByPhone = priceByPhone;
	}

	public void setPriceAtVenue(double priceAtVenue) {
		this.priceAtVenue = priceAtVenue;
	}
	
	public int TotalNumberOfTicketsSold() {
		return (getNumberOfTicketsSoldByPhone() + getNumberOfTicketsSoldAtVenue());
	}
	
	public int TicketsRemaining() {
		return getCapacity() - TotalNumberOfTicketsSold();
	}
	
	public void BuyTicketsByPhone(int numberOfTickets) {
		setNumberOfTicketsSoldByPhone(numberOfTickets);
	}

	public void BuyTicketsAtVenue(int numberOfTickets) {
		setNumberOfTicketsSoldAtVenue(numberOfTickets);
	}

	public double TotalSales() {
		return (getPriceAtVenue() * getNumberOfTicketsSoldAtVenue()) + (getPriceByPhone() * getNumberOfTicketsSoldByPhone());
	}
	
	

	

}
