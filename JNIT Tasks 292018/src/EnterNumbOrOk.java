import java.util.Scanner;

/*
 * Write a program and continuously ask the user to enter a number or "Ok" to exit. 
 * Calculate the sum of all the previously entered numbers and display it on the console.
 */
public class EnterNumbOrOk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("Enter a number or type (ok) to quit the program.");
			String s = sc.next();
			if (s.equals("ok"))
				break;
			sum += Integer.parseInt(s);

		}
		System.out.println("sum of numbers = " + sum);
	}
}
