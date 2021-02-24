package Clothing;

public class TestShirt {

	public static void main(String[] args) {
		
		Shirt michael = new Shirt();
		michael.setColor("Blue");
		System.out.println("Michael's shirt color is: "+michael.color);
		
		Shirt anthony = new Shirt();
		anthony.setColor("Green");
		System.out.println("Anthony's shirt color is: "+anthony.color);
		
		System.out.println("Michael's shirt color has changed to: "+michael.color);

		System.out.println(" ");
		
		michael.setSize('M');
		System.out.println("Michael's shirt size is: "+michael.size);
		
		anthony.setSize('L');
		System.out.println("Anthony's shirt size is: "+anthony.size);
		
		System.out.println("Michael's shirt size is still: "+michael.size);

		System.out.println(" ");
		
		// Need to make a new object to access putOn() method
		Shirt wear = new Shirt();
		wear.putOn();
		
		// Do not need to make object to access takeOff() and laundry() static methods
		Shirt.takeOff();
		Shirt.laundry();
	}

}
