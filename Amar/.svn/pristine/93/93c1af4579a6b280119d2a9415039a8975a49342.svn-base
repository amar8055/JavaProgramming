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

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 5 unique numbers to sort: ");

		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {

			num[i] = scanner.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == (num[j])) {
					System.out.println("Error: Duplicate values entered. Retry");
					System.exit(0);
				}
			}
		}
		System.out.print("Sorted Order: ");
		for (int i = 0; i < num.length; i++) {
			Arrays.sort(num);
			System.out.print(" " + num[i]);
		}

	}

}
