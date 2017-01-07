package rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		
		double area = rect.areaCalculator(25, 33);
		double perimetr = rect.perimetrCalculator(45, 12);
		System.out.println("Area(25, 33) = " + area);
		System.out.println("Perimetr(45, 12) = " + perimetr);
	}

}
