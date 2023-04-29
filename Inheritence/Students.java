package Inheritence;

public class Students extends Person{
	public Students(String name,String add) {
		super(name,add);
	}
private String program;
private int year;
private double fee;
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
void showStudentInfo() {
	System.out.println("Name :"+getName());
	System.out.println("Address :"+add);
	System.out.println("Program :"+program);
	System.out.println("Year :"+year);
	System.out.println("Fee :"+fee);
}
}
