package abst;

public class rectangle extends shape{
	private double height,width;
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		  this.height=height;
	}
	double getWidth() {
		return width;
	}
	void setWidth(double width) {
		  this.width=width;
	}
public double getArea() {
	return height*width;
}
public double getPerimeter() {
	return 2*(height+width);
	
}
}
