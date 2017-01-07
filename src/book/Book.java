package book;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Title title = new Title();
		Author author = new Author();
		Content content = new Content();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter title: ");
		title.title = in.nextLine();
		System.out.print("Enter author: ");
		author.author = in.nextLine();
		System.out.print("Enter content: ");
		content.content = in.nextLine();
		
		title.show();
		author.show();
		content.show();
	}

}
