package Cars;

public class TravelMain {

	public static void main(String[] args) {
		
		Tesla smallCar = new Tesla();
		smallCar.hybrid();
		
		// Using Constructor #5
		Tesla newCar = new Tesla("Black", 2020);
			System.out.print("Color:" + newCar.color);
			System.out.println(" Year:" + newCar.year);
			
		// Using default constructor
		// Using getter and setter method
		Tesla setCar = new Tesla();
		setCar.setColor("Yellow");
		setCar.setYear(1992);
		System.out.println("Car Color: "+ setCar.getColor()+", Car Year: "+ setCar.getYear());
		
		// Using default constructor with getter and setter method
		DeliveryTruck bigTruck = new DeliveryTruck();
		bigTruck.setDestinationAddress("1600 Pennsylvania Avenue");
		System.out.println(bigTruck.destinationAddress);
		
		// Using constructor #3
		DeliveryTruck favorite = new DeliveryTruck("White", "ABC1234", 18);
		System.out.println("This is my favorite truck: ");
		System.out.println("Color: " + favorite.color);
		System.out.println("License Plate #: " + favorite.licensePlate);
		System.out.println("Number of Wheels: " + favorite.numberOfWheels);
		
	}

}
