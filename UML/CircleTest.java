package UML;

public class CircleTest {
	public static void main(String[] args) {
		ResizableCircle r= new ResizableCircle(12);
		System.out.println("Area : "+r.getArea());
		System.out.println("Perimeter : "+r.getPerimeter());
		r.resize(30);
	}
}
