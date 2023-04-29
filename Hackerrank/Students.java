package Hackerrank;

public class Students extends Person{
private String program;
int year;
double fee;
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program=program;
}
void showstudentinfo() {
	System.out.println("name : "+Person.getName());
	System.out.println("address : "+Person.address);
	System.out.println("Program : ");
	System.out.println("year : ");
	System.out.println("fee : ");
}
}
