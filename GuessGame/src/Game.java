import java.util.Random;

public class Game {
	public int target;
	public int guessCount=0;
	public static int gameCreatCount;
	//public static int guessAverage; //because it is local use, no need for static
	public static int totalguess;

	//constructor
	public Game (int range){
		Random rn = new Random();
		target = rn.nextInt(range)+1; // nextInt(100) takes random number from 0-99				
		//System.out.println("target = " + target);
	}

	//method
	public boolean judgeGuess(int userGuess) {		
		while (userGuess != target) {
			if (userGuess > target) {
				System.out.println("It should be smaller! Give me a new one!");
				return false;
			}
			else {	
				System.out.println("It should be bigger! Give me a new one!");
				return false;
			}
		}
		return true;	
	}


	public int guessCount(){
		guessCount++;
		totalguess++;
		return guessCount;
	}

	public static int gameCreatCount(){
		gameCreatCount++;
		return gameCreatCount;
	}

	public static double guessAverage(int totalguess, int gameCreatCount){		
		return (double) totalguess / gameCreatCount;		 
	}

}
