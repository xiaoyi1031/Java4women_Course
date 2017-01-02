import java.util.Scanner;

public class Developer extends Employee {
	static Scanner sc = new Scanner(System.in);
	//private int addBonus;


	public Developer(String fullName, int birthday, GenderType gender, int salary) {
		super(fullName, birthday, gender, salary);
		this.setPosition(PositionType.DEVELOPER);
		this.setBonus(200);
		this.salaryAfterBonus(200);
	}

	@Override
	public void calculateBonus() {
		int bugsSolved = 0;
		System.out.println("How many bugs did the developer resolve?");
		bugsSolved = sc.nextInt();
		int addBonus = bugsSolved * 50;
		int newBonus = this.getBonus() + addBonus;
		this.setBonus(newBonus);
		this.salaryAfterBonus(addBonus);
		System.out.println("Bonus has been saved as " + this.getBonus());
//		this.setBonus(bonusBase + this.getBonus());
//		System.out.println("Bonus has been saved as " + this.getBonus());
//		return bonusBase;
	}
}
