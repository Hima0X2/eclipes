package UML;

public class Circle implements GeomatricObject{
protected double redius=1;
public Circle(double redius) {
	this.redius=redius;
}
public double getPerimeter() {
	return 2*Math.PI*redius;
}
public double getArea() {
	double area=Math.PI*redius*redius;
	return area;
}
}
