package cars;

class Car {
	private int year;
	private String color;
	
	public Car(){
		System.out.println("first constructor: year = " + this.year + " color = " + this.color);
	}
	
	public Car (int year){
		this.year = year;
		System.out.println("second constructor: year = " + this.year + " color = " + this.color);
	}
	
	public Car(int year, String color){
		this.year = year;
		this.color = color;
		System.out.println("third constructor: year = " + this.year + " color = " + this.color);
	}
}
