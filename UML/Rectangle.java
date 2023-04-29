package UML;

public class Rectangle extends Shape{
	private double width,length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle() {
	System.out.println("It's a rectangle");
	}
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public double getPerimeter() {
		return 2*(width+length);
	}
	public double getArea() {
		return width*length;
	}
	@Override
	public String toString() {
		return getColor();
	}
	
}
