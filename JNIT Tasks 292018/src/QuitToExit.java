/*
 *Write a program and ask the user to continuously enter a number or type "Quit"
 *to exit. The list of numbers may include duplicates. Display the unique numbers that the user has entered. 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuitToExit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("Enter a number or type quit to exit.");
			String s = sc.next();
			List<Integer>numbers = new ArrayList<>();
			
			if (s.equals("quit"))
				break;
			sum += Integer.parseInt(s);

		}
		System.out.println("sum of numbers = " + sum);

	}

}
