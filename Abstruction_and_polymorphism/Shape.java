package Abstruction_and_polymorphism;


public abstract class Shape {
private String color;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
abstract double getArea();
abstract double getPerimeter();
}
