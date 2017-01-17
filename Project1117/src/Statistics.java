import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
	static Scanner give = new Scanner(System.in);

	public void start() {
		String backtomain;
		boolean b = true;
		while (b) {
			System.out.println("\n");
			System.out.println("What would you like to do? Select by number.");
			System.out.println("1. Average salary in the company" + "\n" + "2. Maximum salary in the company" + "\n"
					+ "3. Minimum salary in the company" + "\n" + "4. Total bonus" + "\n"
					+ "5. Percentage of women in the company" + "\n" + "6. Percentage of men per department" + "\n"
					+ "0. back to start page");
			int choose = give.nextInt();

			switch (choose) {
			case 1:
				averageSalary();
				break;
			case 2:
				maximumSalary();
				break;
			case 3:
				minimumSalary();
				break;
			case 4:
				totalBonus();
				break;
			case 5:
				womenPercentage();
				break;
			case 6:
				menPercentage();
				break;
			case 0:
				b = false;
				break;
			default:
				System.out.println("Invalid input!");
				b = true;
			}
		}

	}

	public void averageSalary() {
		int sumOfSalary = 0;
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			sumOfSalary += EmployeeCatalogue.employeeList.get(counter).getSalaryBase();
		}

		int averageSalary = sumOfSalary / EmployeeCatalogue.employeeList.size();
		System.out.println("Average Salary: " + averageSalary);
	}

	public void maximumSalary() {
		int maximumSalary = EmployeeCatalogue.employeeList.get(0).getSalaryBase();
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getSalaryBase() > maximumSalary) {
				maximumSalary = EmployeeCatalogue.employeeList.get(counter).getSalaryBase();
			}
		}
		System.out.println("Maximum Salary: " + maximumSalary);
	}

	public void minimumSalary() {
		int minimumSalary = EmployeeCatalogue.employeeList.get(0).getSalaryBase();
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getSalaryBase() < minimumSalary) {
				minimumSalary = EmployeeCatalogue.employeeList.get(counter).getSalaryBase();
			}
		}
		System.out.println("Minimum Salary: " + minimumSalary);
	}

	public void totalBonus() {
		int totalBonus = 0;
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			totalBonus += EmployeeCatalogue.employeeList.get(counter).getBonus();
		}
		System.out.println("Total bonus: " + totalBonus);
	}

	public void womenPercentage() {
		double totalWomen = 0;
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getGender() == GenderType.FEMALE) {
				totalWomen++;
			}
		}
		double womenPercentage = (totalWomen / ((double) EmployeeCatalogue.employeeList.size()));
		System.out.println("Percentage of women: " + String.format("%.2f", womenPercentage * 100) + "%");
	}

	public void menPercentage() {
		double numberOfMenDB = 0;
		double numberOfMenDEV = 0;
		double numberOfMenTEC = 0;
		double numberOfMenMAR = 0;
		double numberOfMenMGR = 0;
		double totalmen = 0;

		
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getGender() == GenderType.MALE) {
				totalmen++;
				switch (EmployeeCatalogue.employeeList.get(counter).getPosition()) {
				case DBADMIN:
					numberOfMenDB++;
					break;
				case DEVELOPER:
					numberOfMenDEV++;
					break;
				case TECHNICIAN:
					numberOfMenTEC++;
					break;
				case MARKETING:
					numberOfMenMAR++;
					break;
				case MANAGER:
					numberOfMenMGR++;
					break;
				}
			}
		}
		System.out.println("Number of men at the DBAdministration department:" + (int) numberOfMenDB);
		System.out.println("Number of men at the Development department:" + (int) numberOfMenDEV);
		System.out.println("Number of men at the Technical department:" + (int) numberOfMenTEC);
		System.out.println("Number of men at the Marketing department:" + (int) numberOfMenMAR);
		System.out.println("Number of men at the Management department:" + (int) numberOfMenMGR);

		double numberOfDB = 0;
		double numberOfDEV = 0;
		double numberOfTEC = 0;
		double numberOfMAR = 0;
		double numberOfMGR = 0;
		double totaldepartment = 0;

		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			totaldepartment++;
			switch (EmployeeCatalogue.employeeList.get(counter).getPosition()) {
			case DBADMIN:
				numberOfDB++;
				break;
			case DEVELOPER:
				numberOfDEV++;
				break;
			case TECHNICIAN:
				numberOfTEC++;
				break;
			case MARKETING:
				numberOfMAR++;
				break;
			case MANAGER:
				numberOfMGR++;
				break;
			}
		}
		System.out.println();
		System.out.println("Number of employees at the DB Administration department:" + (int) numberOfDB);
		System.out.println("Number of employees at the Development department:" + (int) numberOfDEV);
		System.out.println("Number of employees at the Technical department:" + (int) numberOfTEC);
		System.out.println("Number of employees at the Marketing department:" + (int) numberOfMAR);
		System.out.println("Number of employees at the Management department:" + (int) numberOfMGR);

		
		double resultDB = ((double) numberOfMenDB / numberOfDB * 100);
		double resultDEV = ((double) numberOfMenDEV / numberOfDEV * 100);
		double resultTEC = ((double) numberOfMenTEC / numberOfTEC * 100);
		double resultMAR = ((double) numberOfMenMAR / numberOfMAR * 100);
		double resultMGR = ((double) numberOfMenMGR / numberOfMGR * 100);

		System.out.println();
		System.out.println(
				"Percentage of men at the DB Administration department:" + String.format("%.2f", resultDB) + "%");
		System.out.println("Percentage of men at the Development department:" + String.format("%.2f", resultDEV) + "%");
		System.out.println("Percentage of men at the Technical department:" + String.format("%.2f", resultTEC) + "%");
		System.out.println("Percentage of men at the Marketing department:" + String.format("%.2f", resultMAR) + "%");
		System.out.println("Percentage of men at the Management department:" + String.format("%.2f", resultMGR) + "%");
	}
}
