import java.util.Scanner;

public class Marketer extends Employee {

	//private int newBusinessN;// the number of new customers that the marketer brought to the company.
							
	//private static int bonusBase;

	public Marketer(String fullName, int birthday, GenderType gender, int salary) {
		super(fullName, birthday, gender, salary);
		this.setBonus(500);
		this.salaryAfterBonus(500);
		this.setPosition(PositionType.MARKETING);
	}

	public void calculateBonus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many new customers did they bring to the company?");
		int newBusinessN = sc.nextInt();
		int addBonus = newBusinessN*200;
		int newBonus = this.getBonus() + addBonus;	
		this.setBonus(newBonus);
		this.salaryAfterBonus(addBonus);
		System.out.println("Bonus has been saved as " + this.getBonus());
	}


}
