package guessingGame_Ulf;

import javax.swing.JOptionPane;

public class PlayGuess {

	public static void main(String[] args) {
		int answer;
		
		do{
		GuessingGame game = new GuessingGame(10);
		
		//game.getAverageOfGuesses();
		GuessingGame.getAverageOfGuesses();
		
		while(game.makeGuess() != true){
			System.out.println("Guess # " + game.getNumberOfGuesses());
		}
		System.out.println();
		answer = JOptionPane.showConfirmDialog(null, "Another game?");
		} while (answer == JOptionPane.YES_OPTION); // JOptionPane.YES_OPTION = 0;
	}

}
