package guessingGame_Ulf;

import javax.swing.JOptionPane;

public class GuessingGame {
	private int randomNumber;
	private int numberOfGuesses;

	private static int numberOfGame = 0;
	private static int totalNumberofGuesses = 0;

	public GuessingGame(int range){
		randomNumber = (int) (Math.random() * range + 1);
		System.out.println("New game is with range 1-" + range);
		numberOfGuesses = 0 ;		
	}

	public boolean makeGuess(){
		int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess"));
		numberOfGuesses ++;
		totalNumberofGuesses ++;
		if (guess < randomNumber){
			System.out.println(guess + " is too small");
			return false;
		} else if (guess > randomNumber){
			System.out.println(guess + " is too large");
			return false;
		} else {
			System.out.println(guess + " is correct");
			totalNumberofGuesses ++;
			return true;
		}

	}

	public int getNumberOfGuesses(){
		return numberOfGuesses;
	}

	public static double getAverageOfGuesses(){
		return (double) totalNumberofGuesses / numberOfGame ;
	}
}
