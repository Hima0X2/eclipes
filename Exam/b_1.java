package Exam;

public class b_1 {
int test_a,test_b;
public b_1(int a,int b) {
	test_a=a;
	test_b=b;
}
public static void main(String args[]) {
	b_1 b=new b_1(10,20);
	System.out.println(b.test_a+" "+b.test_b);
}
}
