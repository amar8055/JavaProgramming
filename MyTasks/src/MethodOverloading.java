 
public class MethodOverloading {

	public static void main(String[] args) {
		
	/*
	 * int newScore =calculateScore("Amar", 90); // here this value is automatically returned here so we can use it.
	   System.out.println("NewScore: " +newScore);	
	
	
	calculateScore(90); 
	
	calculateScore(); 
	
		//same method with different parameter is known as method overloading
	}
	public static int calculateScore(String playerName, int score)
	{
		System.out.println(" Player " +playerName+ " Scored " + score + " Points ");
			return score * 1000;	
			
		//we can actually use this return value
	}
	public static int calculateScore( int score)
	{
		System.out.println(" Player Scored " + score + " Points ");
			return score * 1000;	
	}
	public static int calculateScore()
	{
		System.out.println(" No Player so no score.");
			return 0;	
	}
	 */
		double centimeters =calcFeetAndInchesToCentimeters(6, 0);
		if(centimeters<0.0)
		{
			System.out.println("Invalid Parameter");
		}
		calcFeetAndInchesToCentimeters(157);
		
	}
		public static double calcFeetAndInchesToCentimeters(double feet, double inches)
		{ 
			if((feet < 0) || ((inches < 0) || (inches >12 )))
			{
			System.out.println("Invalid Feet or Inches");
 			return -1;
			}
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches= " + centimeters + "cm");
		return centimeters;
		}
		public static double calcFeetAndInchesToCentimeters(double inches)
			{
				if(inches<0)
				{
					return -1;
				}
				double feet =(int) inches/12;
				double remainingInches = (int)inches % 12;
				System.out.println(inches+" inches is equal to " + feet +" feet and" + remainingInches +" remainingInches " );
				return calcFeetAndInchesToCentimeters(feet, remainingInches);
			
				
			
			
			}
			
}
	
	
