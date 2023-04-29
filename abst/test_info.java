package abst;

public class test_info {
	public static void main(String[] args) {
		rectangle r= new rectangle();
		r.setHeight(10);
		r.setWidth(20);
    r.setColor("Blue");
   System.out.println("Rectangle Color :"+r.getColor());
   System.out.println("Rectangle Area :"+r.getArea());
   System.out.println("Rectangle Perimeter :"+r.getPerimeter());
   Circle c= new Circle(12.5,"Red");
System.out.println("Circle Color :"+c.getColor());
System.out.println("Circle Area :"+c.getArea());
System.out.println("Circle Perimeter :"+c.getPerimeter());
	}

}
