/*
 * Write a program and ask the user to enter 5 numbers.
 * If a number has been previously entered, display an error message 
 * and ask the user to re-try. Once the user successfully enters 5 unique numbers,
 * sort them and display the result on the console.
 * 
 */
	import java.util.Arrays;
import java.util.Scanner;
	
public class DisplayErrorMessage {

	static String numbers;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String numbers = "";

		System.out.println("Please enter a series of numbers separated by hyphen");
		numbers = sc.nextLine();

		if (numbers.isEmpty()) {
			System.exit(0);
		}
		String numbersAsString[] = numbers.split(" ");

		
		int array[] = new int[numbersAsString.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(numbersAsString[i]);
			System.out.println(array[i]);
		}

		// This forloop is to check duplications in the input.

		first: for (int i1 = 0; i1 <= array.length - 1; i1++) {
			for (int j1 = 1; j1 <= array.length - 1; j1++) {
				if (array[i1] == array[j1] && (i1 != j1)) {
					System.out.println("Duplicates");
					break first;
				}

			}

		}

	}

}


