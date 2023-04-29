package Hackerrank;

public class calculator {
void sum(int a,long b) {
	System.out.println("a method");
}
void sum(long a,int b) {
	System.out.println("b method");
}
public static void main(String[] args){
	int p=20;
	long b=20;
	calculator a=new calculator();
	a.sum(p,b);
}
}
