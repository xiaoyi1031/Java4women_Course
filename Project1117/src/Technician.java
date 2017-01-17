import java.util.Scanner;

public class Technician extends Employee {
	//private int bonusBase;

	public Technician(String fullName, int birthday, GenderType gender, int salary) {
		super(fullName, birthday, gender, salary);
		this.setPosition(PositionType.TECHNICIAN);
		this.setBonus(250);
		this.salaryAfterBonus(250);
	}

	public void calculateBonus() {
		int ticketClosed;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many tickets did the technician close?"); // Each ticket is a problem solved.
		ticketClosed = sc.nextInt();
		int addBonus = ticketClosed * 50;
		int newBonus = this.getBonus() + addBonus;
		this.setBonus(newBonus);
		this.salaryAfterBonus(addBonus);
	}

}
