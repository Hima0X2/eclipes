package Inheritence;

public class Adder extends Arithmetic{
	@Override
	int add(int a,int b,int c){
		 super.add(a, b, c);
		 int mul=a*b*c;
		 return mul;
	}
}
