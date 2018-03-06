
/*
 * Write a program and ask the user to enter a few numbers	separated by a hyphen.
 * Work out if the numbers are consecutive. For example, if the input is "5-6-7-8-9"
 * or "20-19-18-17-16", display a message: "Consecutive"; otherwise, display "Not Consecutive".
 */

import java.util.Arrays;
import java.util.Scanner;

public class HypenConsequtive {

	static String numbers;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String numbers = "";

		System.out.println("Please enter a series of numbers separated by hyphen");
		numbers = sc.nextLine();

		String numbersAsString[] = numbers.split("-");

		// We have to Convert String to Integer for That we have to Parse
		int array[] = new int[numbersAsString.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(numbersAsString[i]);
		}

		for (int i1 = 0; i1 < array.length - 1; i1++) {
			if (array[i1] + 1 == array[i1 + 1]) {
				System.out.println("Consequtive");
				break;
			} else {
				System.out.println("Not Consequtive");
				break;
			}
		}

	}

}
