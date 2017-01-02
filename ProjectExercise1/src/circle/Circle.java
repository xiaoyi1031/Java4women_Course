package circle;
import javax.swing.JOptionPane;

public class Circle {
	private final double PI = 3.14;
	private double radius;
	
	//Constructor
	public Circle(double radius){
		this.radius = radius;
	}
	
	//getter
	public double getRadius(){
		return radius;
	}
	
	//setter
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//other methods
	public double area(){
		double area = radius * radius * PI;
		return area;
	}
	
	public double circumference(){
		double circum = 2 * radius * PI;
		return circum;
	}
	
	public void Calculation(){
		int guess = Integer.parseInt(JOptionPane.showInputDialog("What result do you want to know? 1:area/2:circumference/3:both"));

		switch(guess){
		case 1: System.out.println("Circle area with radius " + this.getRadius() + " is " + this.area());break;
		case 2 : System.out.println("Circle circumference with radius " + this.getRadius() + " is " + this.circumference()); break;
		case 3 : 
			System.out.println("Circle area with radius " + this.getRadius() + " is " + this.area());
			System.out.println("Circle circumference with radius " + this.getRadius() + " is " + this.circumference()); break;
		default: System.out.println("This is an invalid input!");
		}
	}
}
