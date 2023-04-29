package Exception;
import java.util.Scanner;
public class Exception1 {
	public static void main(String[] args) {
Scanner input =new Scanner(System.in);
int a,b;
while(true) {
try {
	System.out.println("Enter num1 : ");
	a= input.nextInt();
	System.out.println("Enter num2 : ");
	b= input.nextInt();
	int result=a/b;
	System.out.println("Result : "+result);
	break;
} catch (Exception e) {
	System.out.println("Exception : "+e);
	System.out.println("You Must Enter Integer");
}
}
System.out.println("Finished");
}
}
