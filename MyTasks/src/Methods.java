
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Amar", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Rohi", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Bob", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Urvi", highScorePosition);
	}
		
	public static void displayHighScorePosition(String playerName,int highScore)
	{
		System.out.println(playerName+ "  Managed to get into position"+highScore+" On the high score table");
	}
	public static int calculateHighScorePosition(int playerScore)
	{
		if(playerScore > 1000)
		{
			return 1;	
		}else if(playerScore >500 && playerScore < 1000)
		{
			return 2;
		}else if(playerScore > 100 && playerScore <500)
		{
			return 3;
			
		}else {
			return 4;
		}

	
	}
	}
