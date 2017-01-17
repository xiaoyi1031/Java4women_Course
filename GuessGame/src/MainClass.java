import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int range;
		String choose;
		
		
		do {
			System.out.println("Welcome to guess game! Give me a maximum number!");
			range = a.nextInt();		
			Game game1 = new Game(range); 		
			int b;

			System.out.println("Guess the number (1-" + range +"):");							
			do{
				b = a.nextInt();
				game1.guessCount();	
			} while(!game1.judgeGuess(b));

			System.out.println("Match!");
			System.out.println("The number you have guessed is " + game1.guessCount);
			System.out.println("The number of game have played is " + Game.gameCreatCount());
			a.nextLine();
			System.out.println("Would you like to play again? Y/N");
			choose = a.nextLine();
		}	 while (choose.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		System.out.println("Total number of game created is " + Game.gameCreatCount);
		System.out.println("Total average number of guess is " + Game.guessAverage(Game.totalguess, Game.gameCreatCount));
		a.close();
	}

}
