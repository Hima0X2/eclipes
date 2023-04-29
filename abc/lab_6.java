package abc;

public class lab_6 {

	public static void main(String[] args) {
		try {
			int[] a=new int[-10];
			a[0]=1/0;
			a[1]=1;
			a[2]=2;
			a[3]=3;
		} catch (NegativeArraySizeException e) {
			System.out.println("ArraySize is negative");
		}
		catch (Exception e) {
			System.out.println("ArraySize is positive");
		}
	}
}
