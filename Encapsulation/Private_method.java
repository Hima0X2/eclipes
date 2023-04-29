package Encapsulation;

public class Private_method {
int a,b;
Private_method(int a,int b){
	this.a=a;
	this.b=b;
}
void showinfo() {
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	Private_method p=new Private_method(10, 20);
 p.showinfo();
}
}
