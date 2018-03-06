package com.ReverseString.jnit;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="Amarendhar",rev="";
		 String a[]=name.split("");
	 for(int i=a.length-1; i>=0; i--)
	 {
		 System.out.println(a[i]);
	 }
		 
			
		
			
	 
		/*
		for(int i=name.length()-1; i>=0;i--)
		{
			//rev=rev+name.charAt(i);
			rev=rev+i;
		}
		*/
		
		//System.out.println("Reverse of a String :\r"+ " "  +rev );
	}

}
