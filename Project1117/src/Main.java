import java.util.Scanner;

public class Main {

	static Scanner give = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Java4women Employee System.");
		
		EmployeeManagement employeeMgmt = new EmployeeManagement();
		employeeMgmt.createEmployeeCatalogue();
		Statistics employeeStats = new Statistics();

		boolean b = true;
		while (b) {
			System.out.println("*********************************************************************************");
			System.out.println(
					"*Select one of the following options:                                           *"
					+ "\n*1 for Employee Management, 2 for Employee Statistics, 0 to Exit the application*");
			System.out.println("*********************************************************************************");
			int choose = give.nextInt();
			switch (choose) {
			case 1:
				employeeMgmt.start();
				break;
			case 2:
				employeeStats.start();
				;
				break;
			case 0:
				System.out.println("Exit. Bye!");
				b = false;
				break;
			default:
				System.out.println("Invalid input!");
				b = true;
			}

		}
	}
}