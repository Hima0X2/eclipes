package UML;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setColor("blue");
		r.setWidth(10);
		r.setLength(12);
		System.out.println("Color : "+r.toString());
		System.out.println("Area : "+r.getArea());
		System.out.println("Perimeter : "+r.getPerimeter());
		Rectangle r1=new Rectangle(10,13);	
		r1.setColor("Red");
		System.out.println("Color : "+r1.toString());
		System.out.println("Area : "+r1.getArea());
		System.out.println("Perimeter : "+r1.getPerimeter());
	}

}
