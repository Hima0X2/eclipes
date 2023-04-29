package Abstruction_and_polymorphism;

public class Circle extends Shape{
private double radius;
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
Circle(double radius,String color){
	this.radius=radius;
	this.setColor(color);
}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
