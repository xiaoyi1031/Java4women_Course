
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

	static Scanner give = new Scanner(System.in);

	public EmployeeCatalogue employeeCat = new EmployeeCatalogue();
	public static ArrayList<Employee> removedList = new ArrayList<Employee>();

	Technician e1 = new Technician("Mary Higgins", 19851031, GenderType.FEMALE, 35000);
	Manager e2 = new Manager("Helena Alvefelt", 19850228, GenderType.FEMALE, 64500);
	DBAdmin e3 = new DBAdmin("Mohammed Abdullah", 19971111, GenderType.MALE, 25000);
	Developer e4 = new Developer("Anna Ericsson", 19901121, GenderType.FEMALE, 27000);
	Marketer e5 = new Marketer("Peter StErick", 19850228, GenderType.MALE, 26500);
	DBAdmin e6 = new DBAdmin("Linling Wang", 19901111, GenderType.FEMALE, 35400);
	Developer e7 = new Developer("Bita Jabbari", 19950301, GenderType.FEMALE, 28200);
	Marketer e8 = new Marketer("Bardia Ericsson", 19950401, GenderType.MALE, 31000);
	Manager e9 = new Manager("Xiaoyi Peng", 19850228, GenderType.FEMALE, 64000);
	Technician e10 = new Technician("Simon Edison", 19751019, GenderType.MALE, 30000);
	DBAdmin e11 = new DBAdmin("Fredrik Andersson", 19650519, GenderType.MALE, 24600);
	Marketer e12 = new Marketer("Samira Lundgren", 19980927, GenderType.FEMALE, 31400);
	Developer e13 = new Developer("Fatma Laugh-out-loud", 19980521, GenderType.FEMALE, 27000);
	Manager e14 = new Manager("Andy Abbisa", 19450228, GenderType.MALE, 44900);
	Developer e15 = new Developer("Lars Gröndal", 19880521, GenderType.MALE, 27000);

	public void createEmployeeCatalogue() {

		EmployeeCatalogue.employeeList.add(e1);
		EmployeeCatalogue.employeeList.add(e2);
		EmployeeCatalogue.employeeList.add(e3);
		EmployeeCatalogue.employeeList.add(e4);
		EmployeeCatalogue.employeeList.add(e5);
		EmployeeCatalogue.employeeList.add(e6);
		EmployeeCatalogue.employeeList.add(e7);
		EmployeeCatalogue.employeeList.add(e8);
		EmployeeCatalogue.employeeList.add(e9);
		EmployeeCatalogue.employeeList.add(e10);
		EmployeeCatalogue.employeeList.add(e11);
		EmployeeCatalogue.employeeList.add(e12);
		EmployeeCatalogue.employeeList.add(e13);
		EmployeeCatalogue.employeeList.add(e14);
		EmployeeCatalogue.employeeList.add(e15);

	}

	public static void removedList() {
		removedList.add(EmployeeCatalogue.removedEmployee);
	}
	
	public void displayAllRemovedList(){
		EmployeeCatalogue.printHeader();
			for (int counter = 0; counter < removedList.size(); counter++) {
				EmployeeCatalogue.printArrayList(removedList.get(counter));
			}
		}

	public void start() {
		boolean b = true;

		while (b) {
			System.out.println("\n");
			System.out.println("We have " + employeeCat.getNumberOfEmployee() + " employees.");
			System.out.println("What would you like to do? Select by number.");
			System.out.println("1. add a new employee" + "\n" + "2. remove an employee" + "\n" + "3. update information"
					+ "\n" + "4. search for an employee" + "\n" + "5. display all employees" + "\n"
					+ "6. display all removed employees" + "\n" + "0. back to start page" + "\n" + "7. diplay all employees by descending salary");
			int choose = give.nextInt();

			switch (choose) {
			case 1:
				employeeCat.createNewEmployee();
				break;
			case 2:
				employeeCat.remove();
				break;
			case 3:
				employeeCat.updateEmployee();
				break;
			case 4:
				employeeCat.searchEmployee();
				break;
			case 5:
				EmployeeCatalogue.displayAllEmployees();
				break;
			case 6:
				displayAllRemovedList();
				break;
			case 7:
				employeeCat.displayAllByDescendingSalary();
			case 0:
				b = false;
				break;
			default:
				System.out.println("Invalid input!");
				b = true;
			}
		}

	}

}
