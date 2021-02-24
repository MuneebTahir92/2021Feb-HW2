package Cars;

public class Tesla {

	public String color;
	public int year;
	public char model;
	
	public void hybrid() {
		System.out.println("This car can run on both gas and electric");
	}
	
	public void speedLimit() {
		System.out.println("This car has a max speed of 100mph");
	}
	
	public void stop() {
		System.out.println("You must stop at all red lights");
	}
	
	// Constructor #1 (default constructor)
	public Tesla() {}
	
	// Constructor #2
	public Tesla(String color) { 
		this.color = color;
	}
	
	// Constructor #3
	public Tesla(int year) {
		this.year = year;
	}
	
	// Constructor #4
	public Tesla(char model) {
		this.model = model;
	}
	
	// Constructor #5
	public Tesla(String color, int year) {
		this.color = color;
		this.year = year;
	}
	
	// Constructor #6
	public Tesla(char model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// Getter and Setter Methods
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public char getModel() {
		return model;
	}
	
	public void setModel(char model) {
		this.model = model;
	}
}
