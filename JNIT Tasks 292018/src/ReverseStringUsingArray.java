import java.util.Scanner;

/*
 * Write a program and ask the user to enter their name. Use an 
 * array to reverse the name and then store the result in a new string.
 *  Display the reversed name on the console.
 * 
 */
public class ReverseStringUsingArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String s = sc.nextLine();
		String a[]=s.split("");
	
	for(int i=a.length-1; i>=0; i--)
	 {
		 System.out.println(a[i]);
	 }

	}

}
