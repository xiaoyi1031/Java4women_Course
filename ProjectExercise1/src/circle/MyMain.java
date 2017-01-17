package circle;

import javax.swing.JOptionPane;

public class MyMain {

	public static void main(String[] args) {

		String choose;
		do {
			choose = JOptionPane.showInputDialog("Which calculation do you want you make? circle/triangle/rectangle ");

			if (choose.equalsIgnoreCase("circle")){
				double a = Integer.parseInt(JOptionPane.showInputDialog("Please give me a radius (double number):"));
				Circle c = new Circle(a);
				c.Calculation();

			} else if (choose.equalsIgnoreCase("triangle")){

				double a = Integer.parseInt(JOptionPane.showInputDialog("Please give me a side (double number): "));
				double b = Integer.parseInt(JOptionPane.showInputDialog("Please give me a another side (double number): "));
				double c = Integer.parseInt(JOptionPane.showInputDialog("Please give me a base (double number): "));
				double e = Integer.parseInt(JOptionPane.showInputDialog("Please give me a height (double number): "));

				Triangle t = new Triangle(a, b, c, e);
				t.Calculation();

			} else if (choose.equalsIgnoreCase("rectangle")){

				double a = Integer.parseInt(JOptionPane.showInputDialog("Please give me a side (double number): "));
				double b = Integer.parseInt(JOptionPane.showInputDialog("Please give me a another side (double number): "));

				Rectangle r = new Rectangle(a, b);
				r.Calculation();

			} else {
				System.out.println("This is an invalid input!");
			}
				choose = JOptionPane.showInputDialog("Would you like to try again? Y/N");
		}	 while (choose.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");

	}

}
