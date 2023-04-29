package Encapsulation;

public class CalculateAreaTest {
	public static void main(String[] args) {
		CalculateArea c1= new CalculateArea();
		c1.setH(10);
		c1.setW(20);
		c1.setR(15);
		System.out.println("Rectangle Area : "+c1.rectangle_area());
		System.out.println("Circle Area : "+c1.circle_area());
	}
}
