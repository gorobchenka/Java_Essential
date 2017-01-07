package book;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Title title = new Title();
		Author author = new Author();
		Content content = new Content();
		
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите название книги: ");
		title.title = in.nextLine();
		System.out.print("¬ведите автора книги: ");
		author.author = in.nextLine();
		System.out.print("¬ведите содержание книги: ");
		content.content = in.nextLine();
		
		title.show();
		author.show();
		content.show();
	}

}
