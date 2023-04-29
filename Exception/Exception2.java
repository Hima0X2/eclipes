package Exception;

public class Exception2 {
public static void main(String[] args) {
	try {
		int a=1/0;
		System.out.println("a= "+a);
	} catch (ArithmeticException e) {
		System.out.println(e);
	}
	catch (Exception ex) {
		System.out.println(ex);
	}
}
}
