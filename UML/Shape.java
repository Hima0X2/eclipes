package UML;

public abstract class Shape {
private String color;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
Shape(){
	System.out.println("It's a shape");
}
public abstract double getPerimeter();
public abstract double getArea();
public abstract String toString();
}
