package BookClass;

//import  java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {

		/*
		 * Scanner sc=new Scanner(System.in); //This function is used to take
		 * values from the console
		 * 
		 * 
		 * System.out.println("Title");
		 * 
		 * String title = sc.next();        //This is a scanner class for which we have to import the scanner package//
		 * 
		 * System.out.println("ISBNCODE");
		 * 
		 * int isbncode = sc.nextInt();
		 * 
		 * System.out.println("Authorname");  
		 * 
		 * String authorname = sc.next();
		 * 
		 * System.out.println("Price");
		 * 
		 * int price = sc.nextInt();
		 */

		BookClass bc = new BookClass();
		System.out.println("My Book Title is" + bc.getTitle());

		BookClass bc1 = new BookClass("Prism", 124568, "JamesGoshling", 120);

		System.out.println(bc1.getTitle());
		System.out.println(bc1.getIsbncode());
		System.out.println(bc1.getAuthorname());
		System.out.println(bc1.getPrice());

	}
}
