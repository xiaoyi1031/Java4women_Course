import javax.swing.JOptionPane;

public class Ulf1 {

	public static void main(String[] args) {
	int number = (int) (Math.random() * 1000 + 1) ; // Math.random() is a number between 0-0,999999....
	int guess;
	
	String sGuess = JOptionPane.showInputDialog("Guess my number! (1-1000)"); // from keyboard, it always reads in string
	guess = Integer.parseInt(sGuess);
	
	while(guess != number){
		if (guess < number){
			guess = Integer.parseInt(JOptionPane.showInputDialog("Too small, guess again, should be lager!"));
		} else if (guess > number){
			guess = Integer.parseInt(JOptionPane.showInputDialog("Too large, guess again, should be smaller!"));
		}
		
	}
	
	System.out.println("Correct!");
	
	
	
	
	}

}
