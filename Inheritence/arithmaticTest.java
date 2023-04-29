package Inheritence;

public class arithmaticTest {
	public static void main(String[] args) {
Arithmetic A= new Arithmetic();
A.setA(100);
A.setB(50);
A.setC(10);
System.out.println("sum : "+A.add(A.getA(),A.getB(),A.getC()));
Adder b= new Adder();
b.setA(10);
b.setB(50);
b.setC(10);
System.out.println("mul : "+b.add(b.getA(),b.getB(),b.getC()));
//Adder a2 = new Adder();
}
}
