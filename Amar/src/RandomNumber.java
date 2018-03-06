import java.util.Random;
import java.util.Scanner;

/*
 *  Write a program that picks a random number between 1 and 10. Give the user 4 chances to guess the number.
 *  If the user guesses the number, display you Won"; otherwise, display “You lost". 
 * (To make sure the program is behaving correctly, you can display the secret number on the console first.)
 */
public class RandomNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int num = r.nextInt(9);
		System.out.println("The Random Number is: " +num);
		for(int i=0;i<4;i++)
		{
			System.out.println("Guess a Number between 0-10");
			int guess = sc.nextInt();
			if(guess==num){
				System.out.println("You Won");
			}else{
				System.out.println("You Lost");
			}
		}
		
		
	}

	
		
}		
		


