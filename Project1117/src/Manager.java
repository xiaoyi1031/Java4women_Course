import java.util.Scanner;

public class Manager extends Employee {
//	private int bonusBase;

	public Manager(String fullName, int birthday, GenderType gender, int salary) {
		super(fullName, birthday, gender, salary);
		this.setPosition(PositionType.MANAGER);
		this.setBonus(150);
		this.salaryAfterBonus(150);
	}

	@Override
	public void calculateBonus() {
		int experience = 0;
		Scanner give = new Scanner(System.in);
		System.out.println("Enter how many years experience do the employee has?");
		experience = give.nextInt();
		int addBonus = experience*70;
		int newBonus = this.getBonus() + addBonus;	
		this.setBonus(newBonus);
		this.salaryAfterBonus(addBonus);
		System.out.println("Bonus has been saved as " + this.getBonus());
	}

}
