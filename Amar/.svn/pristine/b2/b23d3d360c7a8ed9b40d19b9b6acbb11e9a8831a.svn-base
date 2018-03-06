import java.util.Scanner;

/*
 * Write a program and ask the user to enter a time value in the 24-hour time format (e.g. 19:00).
 * A valid time should be between 00:00 and 23:59. If the time is valid, display "Ok"; otherwise,
 * display "Invalid Time". If the user doesn't provide any values, consider it as invalid time. 
 */
public class TimeFormat {

	static String time;

	public static void splitTime() {
		String splitTime[] = time.split(":");
		int i = Integer.parseInt(splitTime[0]);
		int j = Integer.parseInt(splitTime[1]);
		if (((i <= 23) && (i >= 00)) && (j <= 59) && (j >= 00)) {
			System.out.println("Ok");
		} else {
			System.out.println("Invalid Time");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time");
		time = sc.nextLine();
		TimeFormat.splitTime();

	}

}
