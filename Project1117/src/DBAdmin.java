import java.util.Scanner;

public class DBAdmin extends Employee {


	//private int addBonus;
	//private int experience;
	
	public DBAdmin(String fullName, int birthday, GenderType gender, int salary){
		super(fullName,birthday,gender, salary);
		this.setPosition(PositionType.DBADMIN);
		this.setBonus(100);
		this.salaryAfterBonus(100);
	}
	@Override
	public void calculateBonus() {
		int experience;
		Scanner give =new Scanner(System.in);	
		System.out.println("Enter how many years experience do the employee  has");
		experience=give.nextInt(); 
		int addBonus=experience*70;
		int newBonus = this.getBonus() + addBonus;	
		this.setBonus(newBonus);
		this.salaryAfterBonus(addBonus);
		System.out.println("Bonus has been saved as " + this.getBonus());
	}

}
