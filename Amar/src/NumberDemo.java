import java.util.Scanner;

/*Write a program and ask the user to enter a number. The number should be between 1 to 10. 
If the user enters a valid number, display "Valid" on the console. Otherwise, display "Invalid". 
(This logic is used a lot in applications where values entered into input boxes need to be validated.)*/
public class NumberDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number Between 1 to 10");
		int a=sc.nextInt();
		
		if(a>0&&a<10)
		{
		System.out.println("Valid Number");	
		}else
		System.out.println("Invalid Number");
				
	}

}