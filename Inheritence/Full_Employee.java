package Inheritence;

public class Full_Employee {
String FirstName,lastName;
double salary;
int year;
public Full_Employee(String FirstName,String lastName,double salary,int year) {
this.FirstName=FirstName;
this.lastName=lastName;
this.salary=salary;
this.year=year;
}
void show_details() {
	System.out.println("Name : "+(FirstName+" "+lastName));
	System.out.println("Year : "+year);
	System.out.println("Salary : "+salary);
}
void calculates_increment_salary() {
	if(year>1) {
		salary=salary*0.05+salary;
	}
	else if(year>3) {
		salary=salary*0.15+salary;	
	}
	else if(year>5) {
		salary=salary*0.2+salary;	
	}
	else if(year>10) {
		salary=salary*0.25+salary+salary/2;
	}
}
}