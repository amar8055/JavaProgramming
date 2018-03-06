import java.util.Scanner;

//Write a program which takes two numbers from the console and displays the maximum of the two
public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Numbers");
		int b =sc.nextInt();
		if(a>b)
		{
			System.out.println("a is Max");
		}else
		{
			System.out.println("b is Max");
		}
	}

}
