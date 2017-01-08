package computer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer[] computers = new Computer[5];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<computers.length; i++){
			System.out.print("Enter name of computer: ");
			Computer computer = new Computer(in.nextLine());
			computers[i] = computer;
		}
		
		for(int i=0; i<computers.length; i++){
			System.out.println(computers[i].getName());
		}
	}

}
