package com.Exceptions.jnit;

//Using throw u can throw a custom exception that u want to throw
//USe your throw keyword to throw your own exception

public class throwDemo {
	
	public static void main(String[] args) {
		//executeSteps();  
		try {
			test();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	public static void test() throws Exception
	{
	System.out.println("Testing.....");
	try {
		throw new Exception("Testing the Exception");
	} catch (Exception e) {
		
		e.printStackTrace();
		throw new Exception("Testing the Catch Block..");
// This is ignored because if we have exception in both catch 
		//and finally block only one is executed
	}finally{
		throw new Exception("Testing Finally Block");
		}
	}
	
	
	public static void executeSteps() 
	{
		Boolean step3Good=false;
		System.out.println("Executing step 1");
		System.out.println("Executing step 2");
		System.out.println("Executing step 3");
		if(!step3Good)
		{
			try {
				throw new RuntimeException("Executing step 3 failed");
			} 
			
			
			/*catch (RunTimeException e) {
				
				e.printStackTrace();*/
			finally{
				
				System.out.println("Finally Block executed twice");
			}
		
		
		
		
		}
			
		

	}
	
		
}
