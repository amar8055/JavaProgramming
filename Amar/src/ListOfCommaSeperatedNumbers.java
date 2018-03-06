/*
 * Write a program and ask the user to supply a list of comma separated numbers (e.g 5, 1, 9, 2, 10). 
 * If the list is empty or includes less than 5 numbers, display "Invalid List"
 * and ask the user to re-try; otherwise, display the 3 smallest numbers in the list.
 * 
 */


import java.util.Arrays;
import java.util.Scanner;

public class ListOfCommaSeperatedNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbers");
		String s = scanner.nextLine();
		String[] array = s.split("[',']");
		
		int[] integer = new int[array.length];
		for (int i = 0; i < integer.length; i++) {
			integer[i] = Integer.parseInt(array[i]);
		}
		
		if(integer.length<5){
			System.out.println("invalid list please re-try");
		}
			
		else{
			Arrays.sort(integer);
			System.out.println("Display 3 smallest Number in the List:");
			for(int j=0;j<3;j++)
			{
				System.out.println(integer[j]);
			}	
			
		}

	}

}
