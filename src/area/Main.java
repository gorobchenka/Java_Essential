package area;

import java.util.Scanner;

public class Main {
	public static void main(String []args){
		MyArea area = new MyArea();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int radius = in.nextInt();
		System.out.println(area.areaOfCircle(radius));
	}
}
