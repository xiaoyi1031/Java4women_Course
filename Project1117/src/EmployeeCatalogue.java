import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeCatalogue {

	static ArrayList<Employee> employeeList = new ArrayList<>();
	static Scanner give = new Scanner(System.in);
	static Employee removedEmployee;


	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public int getNumberOfEmployee() {
		return employeeList.size();
	}

	public void add(Employee newEmployee) {
		employeeList.add(newEmployee);
	}

	public void createNewEmployee() {
		Employee createNewEmployee = null;
		System.out.println("Now we create a new Employee.");
		System.out.print("Type full name: ");
		String fullNam = give.nextLine();
		System.out.print("Insert the birthdate using the format YYYYMMDD: ");
		int birthD = give.nextInt();
		System.out.print("Select the gender of new Employee? 1.Female, 2.Male ");
		int g = give.nextInt();

		GenderType gender = null;
		switch (g) {
		case 1:
			gender = GenderType.FEMALE;
			break;
		case 2:
			gender = GenderType.MALE;
			break;
		default:
			System.out.println("Invalid input!");
		}

		System.out.println("Select the position by the corresponding number:");
		System.out.print("1.DBAdmin, 2.Developer, 3.Technician, 4.Marketing, 5.Manager");
		int choose = give.nextInt();
		System.out.print("Specify the salary:");
		int salary = give.nextInt();

		switch (choose) {
		case 1:
			DBAdmin temp = new DBAdmin(fullNam, birthD, gender, salary);
			createNewEmployee = temp;
			break;
		case 2:
			Developer temp1 = new Developer(fullNam, birthD, gender, salary);
			createNewEmployee = temp1;
			break;
		case 3:
			Technician temp2 = new Technician(fullNam, birthD, gender, salary);
			createNewEmployee = temp2;
			break;
		case 4:
			Marketer temp3 = new Marketer(fullNam, birthD, gender, salary);
			createNewEmployee = temp3;
			break;
		case 5:
			Manager temp4 = new Manager(fullNam, birthD, gender, salary);
			createNewEmployee = temp4;

			break;
		default:
			System.out.println("Invalid input!");
		}
		employeeList.add(createNewEmployee);
		System.out.println("The new employee has been saved.");
		printHeader();
		printArrayList(createNewEmployee);
		System.out.println();
	}

	public void remove() {
		System.out.println("Please type in the ID of employee you want to remove.");
		int id = give.nextInt();
		removedEmployee = findEmployee(id);
		employeeList.remove(removedEmployee);
		System.out.println("The employee is removed.");
		// new
		EmployeeManagement.removedList.add(removedEmployee);

	}

	public void updateEmployee() {
		System.out.println("Please type in the ID of employee you want to update.");
		int id = give.nextInt();
		Employee temp = findEmployee(id);
		// before update
		System.out.println("The employee information is:");
		printHeader();
		printArrayList(temp);
		;
		System.out.println();

		System.out.println("Please select which information you want to update.");
		System.out.println("1. name, 2. birthday, 3. salary, 4. bonus, 5. absence");
		id = give.nextInt();

		switch (id) {
		case 1:
			temp.setFullName();
			break;
		case 2:
			temp.setBirthday();
			break;
		case 3:
			temp.setSalary();
			break;
		case 4:
			temp.calculateBonus();
			break;
		case 5:
			temp.salaryAfterAbsence();
			break;
		default:
			System.out.println("Invalid input!");
		}

		// after update
		System.out.println("Now the updated employee information is: \n");
		printHeader();
		printArrayList(temp);

	}

	public void searchEmployee() {
		System.out.println("Select your search criteria:");
		System.out.println("1. ID, 2. Name, 3. Department");
		int choose = give.nextInt();
		switch (choose) {
		case 1:
			findEmployeeById();
			break;
		case 2:
			findEmployeeByName();
			break;
		case 3:
			findEmployeeByDepartment();
			break;
		}
	}

	private void findEmployeeByDepartment() {
		try {
			findEmployeeByDepartmentEx();
		} catch (EmployeeNotFoundException e) {
			System.out.println("The Employee is not found!");
		}
	}

	private void findEmployeeByDepartmentEx() throws EmployeeNotFoundException{
		System.out.println("Select the department number:");
		System.out.println("1.DBAdmin, 2.Developer, 3.Technician, 4.Marketing, 5.Manager;");
		int find = give.nextInt();

		PositionType position = null;
		switch (find) {
		case 1:
			position = PositionType.DBADMIN;
			break;
		case 2:
			position = PositionType.DEVELOPER;
			break;
		case 3:
			position = PositionType.TECHNICIAN;
			break;
		case 4:
			position = PositionType.MARKETING;
			break;
		case 5:
			position = PositionType.MANAGER;
			break;
		}
		

		printHeader();
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getPosition() == position) {
				printArrayList(EmployeeCatalogue.employeeList.get(counter));
			}
		} throw new EmployeeNotFoundException();
	}

	private void findEmployeeByName() {
		try {
			findEmployeeByNameEx();
		} catch (EmployeeNotFoundException e) {

			System.out.println("The Employee is not found");
		} 
	}

	private void findEmployeeByNameEx() throws EmployeeNotFoundException {
		give.nextLine();
		System.out.println("Please type the name:");
		String findingName = give.nextLine();
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getFullName().equalsIgnoreCase(findingName)) {
				System.out.println("The employee is found!");
				printHeader();
				printArrayList(EmployeeCatalogue.employeeList.get(counter));
				System.out.println();
			}
		} throw new EmployeeNotFoundException();
	}

	public void findEmployeeById() {
		System.out.println("Please type the employee ID.");
		int id = give.nextInt();
		Employee foundEmployee = findEmployee(id);

		//you can do it , but not the java way to handle the exception
		if (foundEmployee != null) {
			System.out.println("The employee is found!");
			printHeader();
			printArrayList(foundEmployee);
		} else {
			System.out.println("The employee is not found!");
		}
		System.out.println();
	}

	public Employee findEmployee(int id) {
		for (int counter = 0; counter < EmployeeCatalogue.employeeList.size(); counter++) {
			if (EmployeeCatalogue.employeeList.get(counter).getId() == id) {
				return EmployeeCatalogue.employeeList.get(counter);
			}
		}
		return null;
	}

	//display
	public void displayEmployees() {
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).toString());
		}
	}

	public static void displayAllEmployees() {
			Comparator<Employee> descendingComparator = (arg0, arg1) -> {
				int result = 0;
				if (arg0.getId() > arg1.getId()) result = 1;
				if (arg1.getId() > arg0.getId()) result = -1;
				
				return result;
			};
			
			Collections.sort(getEmployeeList(), descendingComparator);
		
		printHeader();
		printCatalog();

	}

	public static void printHeader() {
		System.out.println(
				"Id    Full Name                Birthdate     Gender    Position      Salary Base   Bonus     Deduction   Actual Salary");
	}

	public static void printArrayList(Employee employee) {
		System.out.println(fixLengthString(employee.getId(), 6) + fixLengthString(employee.getFullName(), 25)
		+ fixLengthString(employee.getBirthday(), 14) + fixLengthString(employee.getGenderString(), 10)
		+ fixLengthString(employee.getPositionString(), 14) + fixLengthString(employee.getSalaryBase(), 14)
		+ fixLengthString(employee.getBonus(), 10) + fixLengthString(employee.getSalaryDeduction(), 12)
		+ fixLengthString(employee.getSalaryAfterAbsence(), 7));
	}

	private static String fixLengthString(String start, int length) {
		if (start.length() >= length) {
			return start.substring(0, length);
		} else {
			while (start.length() < length) {
				start += " ";
			}
			return start;
		}
	}

	private static String fixLengthString(int start, int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}

	public static void printCatalog() {
		for (int counter = 0; counter < employeeList.size(); counter++) {
			printArrayList(employeeList.get(counter));
		}
	}

	public void displayAllByDescendingSalary() {
		Comparator<Employee> descendingComparator = (arg0, arg1) -> {
			int result = 0;
			if (arg0.getSalaryAfterAbsence() < arg1.getSalaryAfterAbsence()) result = 1;
			if (arg1.getSalaryAfterAbsence() < arg0.getSalaryAfterAbsence()) result = -1;
			
			return result;
		};
		
		Collections.sort(getEmployeeList(), descendingComparator);
		printHeader();
		printCatalog();
		
	}
}
