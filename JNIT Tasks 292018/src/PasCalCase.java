/*
 * Write a program and ask the user to enter a few words separated by a space.
 *  Use the words to create a variable name with PascalCase. For example, if the 
 *  user types: "number of students", display "NumberOfStudents". Make sure that the
 *   program is not dependent on the input. So, if the user types "NUMBER OF STUDENTS",
 *    the program should still display "NumberOfStudents"

 *   
 */


import java.util.Scanner;

public class PasCalCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String var =" ";
		
		System.out.println("Enter Few Words seperated by Space");
		
		String s= sc.nextLine();
		
		String word [] = s.split(" ");
		
		for (String string : word) {
			
			string = string.toUpperCase();
			
			String restValue = string.substring(1);
     		
     		var += string.charAt(0)+ restValue.toLowerCase();
							
		}
		
		System.out.println(var);
		
 }

}
