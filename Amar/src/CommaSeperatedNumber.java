/*
 * Write a program and ask the user to enter a series of numbers separated by comma.
 *  Find the maximum of the numbers and display it on the console. For example, if 
 *  the user enters “5, 3, 8, 1, 4", the program should display 8.
 * 
 */
import java.util.Scanner;
public class CommaSeperatedNumber {

		public static void main(String[] args)throws Exception {
			String s = null;
			System.out.println("Enter a series of numbers separated by comma : ");
			Scanner scanner = new Scanner(System.in);
			s = scanner.nextLine();
			String[] array = s.split("[',']");

			int[] integer = new int[array.length];
			for (int i = 0; i < integer.length; i++) {
				integer[i] = Integer.parseInt(array[i]);
				
			}
		     int max = integer[0];
			for (int i = 0; i < integer.length; i++) {
				if (max < integer[i]) {
					max = integer[i];
				}
			}
			System.out.println("The Maximum value of the String:" + max);
		}
	}