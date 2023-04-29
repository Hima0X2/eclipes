package abst;
public class Circle extends shape{
	private double redius;
	double getRedius() {
		return redius;
	}
	void setRedius(double redius) {
		  this.redius=redius;
	}
	public double getArea() {	
		double a= getRedius();
		return Math.PI*a*a;
	}
	public double getPerimeter() {
		double b=getRedius();
		return 2*Math.PI*b;
	}
 Circle(double redius,String color) {
	   this.redius=redius;
		this.setColor(color);
	}
}
