package circle;

import javax.swing.JOptionPane;

public class Triangle {
	private double side1;
	private double side2;
	private double base;
	private double height;

	public Triangle(double side1, double side2, double base, double height){
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		this.height = height;		
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//other methods

	public double area(){
		double area = base * height / 2 ;
		return area;
	}

	public double circumference(){
		double circum = base + side1 + side2;
		return circum;
	}

	public void Calculation(){
		int guess = Integer.parseInt(JOptionPane.showInputDialog("What result do you want to know? 1:area/2:circumference/3:both"));

		switch(guess){
		case 1 : 
			System.out.println("Triangle area, with side " + this.getSide1() + " and side " + this.getSide2() 
			+ " and height " + this.getHeight() + " and base " + this.getBase() + ", is " + this.area()); break;
		case 2 : 
			System.out.println("Triangle circumference, with side " + this.getSide1() + " and side " + this.getSide2() 
			+ " and height " + this.getHeight() + " and base " + this.getBase() + ", is " + this.circumference()); break;
		case 3 : 
			System.out.println("Triangle area, with side " + this.getSide1() + " and side " + this.getSide2() 
			+ " and height " + this.getHeight() + " and base " + this.getBase() + ", is " + this.area());
			System.out.println("Triangle circumference, with side " + this.getSide1() + " and side " + this.getSide2() 
			+ " and height " + this.getHeight() + " and base " + this.getBase() + ", is " + this.circumference());
			; break;
		default: System.out.println("This is an invalid input!");
		}
	}
}
