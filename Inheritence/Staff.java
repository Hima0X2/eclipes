package Inheritence;

public class Staff extends Person{
	public Staff(String name, String add) {
		super(name, add);
	}
private String School;
private double pay;
public double getPay() {
	return pay;
}
public void setPay(double pay) {
	this.pay = pay;
}
public String getSchool() {
	return School;
}
public void setSchool(String school) {
	School = school;
}
void showStaffInfo() {
	System.out.println("Name :"+getName());
	System.out.println("School :"+School);
	System.out.println("Pay :"+pay);
}
}
