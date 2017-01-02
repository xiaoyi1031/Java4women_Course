package circle;

import javax.swing.JOptionPane;

public class Rectangle {
	private double side1;
	private double side2;
	
	public Rectangle(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double area(){
		double area = side1 * side2;
		return area;
	}
	
	public double circumference(){
		double circum = 2 * (side1 + side2);
		return circum;
	}
	
	public void Calculation(){
		int guess = Integer.parseInt(JOptionPane.showInputDialog("What result do you want to know? 1:area/2:circumference/3:both"));
		
		switch(guess){
		case 1 : 
			System.out.println("Rectangle area with side " + this.getSide1() + " and side " + this.getSide2() +" is " + this.area());break;
		case 2 : 
			System.out.println("Rectangle circumference with side " + this.getSide1() + " and side " + this.getSide2() +" is " + this.circumference()); break;
		case 3 : 
			System.out.println("Rectangle area with side " + this.getSide1() + " and side " + this.getSide2() +" is " + this.area());
			System.out.println("Rectangle circumference with side " + this.getSide1() + " and side " + this.getSide2() +" is " + this.circumference());
			; break;
		default: System.out.println("This is an invalid input!");
		}
	}
}
