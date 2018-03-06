package com.javaSamplePgrms.java;

/*public class NonStaticMethod {
	
	static int i=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i++);
	}

}
*/

 public class NonStaticMethod {
	
	int i=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are trying to print non-static variable in static content");
		NonStaticMethod nsm = new NonStaticMethod();
		System.out.println(nsm.i++ );
	}

}


 
