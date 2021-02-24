package Clothing;

public class Shirt {
	
	static String color;
	char size;
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public void setSize (char size) {
		this.size = size;
	}
	
	public void putOn() {
		System.out.println("Put on the shirt");
	}
	
	public static void takeOff() {
		System.out.println("Take off the shirt");
	}
	
	public static void laundry() {
		System.out.println("Wash the shirt");
	}

}
