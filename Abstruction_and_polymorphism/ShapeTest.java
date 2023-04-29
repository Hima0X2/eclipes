package Abstruction_and_polymorphism;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.setHeight(12);
		r.setWidth(10);
		System.out.println("area : "+r.getArea());
		System.out.println("Perimeter : "+r.getPerimeter());
		Circle c= new Circle(120, "blue");
		System.out.println("area : "+c.getArea());
		System.out.println("Perimeter : "+c.getPerimeter());
	}
}
