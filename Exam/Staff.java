package Exam;

public class Staff extends Person{
private double pay;
String school;
public double getPay() {
	return pay;
}
public void setPay(double pay) {
	this.pay = pay;
}
void showstaffinfo() {
	System.out.println("Name "+getName());
	System.out.println("School "+school);
	System.out.println("Pay "+getPay());
}
}
