package Abstruction_and_polymorphism;

public class Rectangle extends Shape{
private double height,width;
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
@Override
double getArea() {
	return height*width;
}

@Override
double getPerimeter() {
	return 2*(height+width);
}
}
