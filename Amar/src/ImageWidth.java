import java.util.Scanner;

// Write a program and ask the user to enter the width and height of an image. 
//Then tell if the image is landscape or portrait.
public class ImageWidth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Width and height of an Image");
		int Width =sc.nextInt();	
		System.out.println("Enter the Width= "+Width);
		int Height =sc.nextInt();
		System.out.println("Enter the height= " +Height);
		if(Width>Height)
		{
		System.out.println("Image is in LandScape");	
		}else{
		System.out.println("Image is in Portrait");	
		}
		
	}

}
