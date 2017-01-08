package car2;

public class Car {
	private static int year;
	private static String color;
	private static int weight;
	private static double speed;
	
	public Car(){
		this(year, color, weight, speed);
//		System.out.println("first Constructor year = " + this.year+" color = "+this.color+" weight = "+this.weight+" speed = " + this.speed);
	}
	
	public Car(int year){
		this(year, color, weight, speed);
		this.year = year;
//		System.out.println("second Constructor year = " + this.year+" color = "+this.color+" weight = "+this.weight+" speed = " + this.speed);
	}

	public Car(int year, String color){
		this(year, color, weight, speed);
		this.year = year;
		this.color = color;
//		System.out.println("third Constructor year = " + this.year+" color = "+this.color+" weight = "+this.weight+" speed = " + this.speed);
	}

	public Car(int year, String color, int weight){
		this(year, color, weight, speed);
		this.year = year;
		this.color = color;
		this.weight = weight;
//		System.out.println("fourth Constructor year = " + this.year+" color = "+this.color+" weight = "+this.weight+" speed = " + this.speed);
	}

	public Car(int year, String color, int weight, double speed){
		this.year = year;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
		System.out.println("fifth Constructor year = " + this.year+" color = "+this.color+" weight = "+this.weight+" speed = " + this.speed);
	}

}
