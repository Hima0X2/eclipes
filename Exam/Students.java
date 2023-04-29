package Exam;

public class Students extends Person{
private String program;
int year;
double fee;
public void setProgram(String program) {
	this.program = program;
}
public String getProgram() {
	return program;
}
void showstudentinfo() {
	System.out.println("Name "+getName());
	System.out.println("Address "+address);
	System.out.println("Program "+program);
	System.out.println("Year "+year);
	System.out.println("Fee "+fee);
}
}
