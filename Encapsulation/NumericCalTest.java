package Encapsulation;

public class NumericCalTest {

	public static void main(String[] args) {
		NumericCal n1= new NumericCal();
		n1.setNum1(10);
		n1.setNum2(20);
		n1.setNum3(30);
		int p= n1.getNum1(),q=n1.getNum2(),r=n1.getNum3();
		System.out.println("max : "+n1.findMax(p, q, r));
		System.out.println("min : "+n1.findMin(p, q, r));
		System.out.println("Avr : "+n1.findAvr());
	}

}
