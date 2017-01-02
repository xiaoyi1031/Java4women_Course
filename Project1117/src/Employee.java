import java.util.Scanner;

public abstract class Employee {

	private int id = 0;
	private String fullName;
	private int birthday;
	private GenderType gender;
	private PositionType position;
	private int salaryBase;
	private static int employeeGenerator;
	private int bonus;
	static Scanner give = new Scanner(System.in);
	private double absenceDays;
	private int actualSalary;
	private int salaryDeduction;

	public Employee(String fullName, int birthday, GenderType gender, int salaryBase) {
		employeeGenerator++;
		this.id = employeeGenerator;
		this.fullName = fullName;
		this.birthday = birthday;
		this.gender = gender;
		this.salaryBase = salaryBase;
		this.actualSalary = salaryBase;
		this.bonus = 0;
	}

	@Override
	public String toString() {
		return "ID:" + this.id +   "   Name:" + this.fullName  +"    Birthdate:"+ this.birthday + "   Gender:" + this.gender + "   Position:"
				+ this.position + "   Salary:" + this.salaryBase + "   Bonus:" + this.bonus  + "   Deduction:" + this.salaryDeduction + "   Actual Salary:" + this.actualSalary;

	}


	public double getAbsenceDays() {
		return absenceDays;
	}

	public int getSalaryAfterAbsence() {
		return actualSalary;
	}

	public int getSalaryDeduction() {
		return salaryDeduction;
	}


	public void setAbsenceDays(double absenceDays) {
		this.absenceDays = absenceDays;
	}

	public void setSalaryAfterAbsence(int salaryAfterAbsence) {
		this.actualSalary = salaryAfterAbsence;
	}

	public void setSalaryDeduction(int salaryDeduction) {
		this.salaryDeduction = salaryDeduction;
	}


	public int getBonus() {
		return bonus;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}


	public int getBirthday() {
		return birthday;
	}

	public GenderType getGender() {
		return gender;
	}


	public String getGenderString() {
		return gender.toString();
	}

	public String getPositionString() {
		return position.toString();
	}


	public int getSalaryBase() {
		return salaryBase;
	}

	public PositionType getPosition() {
		return position;
	}

	public void setPosition(PositionType position) {
		this.position = position;
	}

	public void setFullName() {
		System.out.println("What is the new full name?");
		String fullName = give.nextLine();
		this.fullName = fullName;
		System.out.println("The name has been saved!");
	}

	public void setBirthday() {
		System.out.println(("What is the birthday?YYYYMMDD"));
		int birthday = give.nextInt();
		this.birthday = birthday;
		System.out.println("The birthday has been saved");
	}

	public void setSalary() {
		System.out.println("What is the new salary?");
		int newSalary = give.nextInt();
		this.salaryBase = newSalary;
		System.out.println("The salary has been changed!");
	}



	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void salaryAfterBonus(int bonus){
		actualSalary += bonus;
	}

	public double getabsenceDays() {
		return absenceDays;

	}
	public void setAbsenceDays() {
		System.out.println("How many days was the employee absent? Add 0.5 for half a day.");
		absenceDays += give.nextDouble();
		System.out.println("The absence days has been recorded!");

	}
	public double salaryAfterAbsence (){
		setAbsenceDays();
		salaryDeduction = (int) ((absenceDays*salaryBase/24));	//A full months pay is 24 days. 
		System.out.println("The salary will be decreased with: " + salaryDeduction + " SEK.");
		actualSalary -= salaryDeduction;
		System.out.println("Total salary to receive is: " + actualSalary + " SEK.");
		return actualSalary;
	}

	abstract public void calculateBonus();

}