package Exam;

public class b_8 {

	public static void main(String[] args) {
		int a[]= new int[8];
		try {
			a[9]=1/0;
		} 
		catch (Exception e) {
			System.out.println(e);
		}
 }

}
