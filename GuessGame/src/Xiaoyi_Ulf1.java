import java.util.*;
import java.util.Scanner;

public class Xiaoyi_Ulf1 {

	public static void main(String[] args) {

		Random rn = new Random();
		int target = rn.nextInt(100)+1; // nextInt(100) takes random number from 0-99
		int userGuess = 0;
		String choose;

		System.out.println(target);

		Scanner a = new Scanner(System.in);
		System.out.println("Guess the number (1-100):");
		userGuess = a.nextInt();
		do {
			while (userGuess != target) {
				if (userGuess > target) {
					System.out.println("It should be lower!");
					userGuess = a.nextInt();
				}
				else {
					System.out.println("It should be higher!");
					userGuess = a.nextInt();
				}
			}
			System.out.println("It is match!");
			System.out.println("Would you like to try again? Y/N");
			choose = a.nextLine();
		}	 while (choose.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		a.close();
	}

}
