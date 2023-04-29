package practice;

public class exception {

	public static void main(String[] args) {
		int[] a=new int[1];
try {
	a[0]=1/0;
	a[2]=1;
	a[3]=2;
	
}
catch (IndexOutOfBoundsException e) {
	System.out.println("hlw");
	}
catch (ArithmeticException e) {
	System.out.println("hi");
}
	}

}
