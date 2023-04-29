package java_final;

public class string_to_integer {
	public static void main(String[] args) {
		int i=100;
		String s = "1000";
		int b=Integer.parseInt(s, 2);
		System.out.println(b);
		int c=Integer.valueOf(s, 2);
		System.out.println(c);
		}
}
