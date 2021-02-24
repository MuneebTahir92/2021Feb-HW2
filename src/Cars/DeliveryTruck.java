package Cars;

public class DeliveryTruck {
	
	protected String color;
	protected int numberOfWheels;
	protected int length;
	protected String destinationAddress;
	protected String licensePlate;
	
	// Constructor #1 (default constructor)
	public DeliveryTruck() {}
	
	// Constructor #2
	public DeliveryTruck(int numberOfWheels, int length) {
		this.numberOfWheels = numberOfWheels;
		this.length = length;
	}
	
	// Constructor #3
	public DeliveryTruck(String color, String licensePlate, int numberOfWheels) {
		this.color = color;
		this.licensePlate = licensePlate;
		this.numberOfWheels = numberOfWheels;
	}
	
	// Getter and Setter Methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	

}
