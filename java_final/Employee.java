package java_final;
public class Employee {
String firstname,lastname;
double salary;
Employee(String firstname,String lastname,double salary) {
	this.firstname=firstname;
	this.lastname= lastname;
	this.salary=salary;
}
void displayinfo() {
	System.out.println("name : "+(firstname+lastname));
	System.out.println("salary : "+salary);
}
}
