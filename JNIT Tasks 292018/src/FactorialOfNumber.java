import java.util.Scanner;

//Write a program and ask the user to enter a number. Compute the factorial of the number and
//print it on the console. 
//For example, if the user enters 5, the program should 
//calculate 5 x 4 x 3 x 2 x 1 and display it as 5! = 120.
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc=new Scanner(System.in);
		 int fact =1;
		
		System.out.println("Enter a number");
		int j = sc.nextInt();
		
		for(int i=1;i<j;i++)
		{
			
			fact = fact*i;
			System.out.println("The fact of a given number" +fact);
		}
	}

}
