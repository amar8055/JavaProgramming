import java.util.Scanner;

/*
 *   Your job is to write a program for a speed camera. For simplicity, ignore the details such as camera,
 *   sensors, etc and focus purely on the logic. Write a program that asks the user to enter the speed limit.
 *   Once set, the program asks for the speed of a car. If the user enters a value less than the speed limit, 
 *   program should display Ok on the console. If the value is above the speed limit, the program should
 *   calculate the number of demerit points. For every 5km/hr above the speed limit, 1 demerit points 
 *   should be incurred and displayed on the console. If the number of demerit points is above 12,
 *   the program should display License Suspended.
 */
public class SpeedCamera {

	public static void main(String arg[]) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		int speedlimit;
		int carspeed;
		System.out.println("please enter limit speed ");
		speedlimit = scanner.nextInt();
		System.out.println("please enter  car speed");
		carspeed = scanner1.nextInt();
		if (speedlimit >= carspeed) {
			System.out.println("OK");

		} else {
			int kpDmrt = 5;

			int dmrt = (carspeed - speedlimit) / kpDmrt;

			if (dmrt > 12)
				System.out.println("License Suspended");
			else
				System.out.println("Demerit points: " + dmrt);
		}
	}
}