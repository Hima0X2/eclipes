package abc;

public class lab_5 {
	public static void main(String[] args) {
	Number a=new Number();
	a.setNumber(10);
	System.out.println("value 10");
	System.out.println("Zero "+a.isZero());
	System.out.println("Negative "+a.isNegative());
	System.out.println("Positive "+a.isPositive());
	System.out.println("Odd "+a.isOdd());
	System.out.println("Even "+a.isEven());
	System.out.println("Amstrong "+a.isAmstrong());
	System.out.println("Factrial "+a.getFactorial());
	System.out.println("Sqrt "+a.getsqrt());
	System.out.println("Square "+a.getSquare());
	System.out.println("Sum of Digit "+a.sumDigit());
	System.out.println("Reverse "+a.getReverse());
	}
}