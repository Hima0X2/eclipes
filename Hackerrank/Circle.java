package Hackerrank;

public class Circle {
private double radius=1.0;
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public Circle() {
	System.out.println("This is circle");
}
public Circle(double radius) {
	this.radius=radius;
}
double getArea() {
	return Math.PI*radius*radius;	
}
double getCircumference() {
	return 2*Math.PI*radius;
	
}
public String toString() {
	return "Circle";
}
public static void main(String[] args) {
	Circle c=new Circle(10);
	System.out.println(c.toString());
	System.out.println("Area = "+c.getArea());
	System.out.println("Area = "+c.getCircumference());
}
}
