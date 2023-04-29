package Encapsulation;

public class Employee {
private String firstname,lastname;
private double salary;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
void showinfo() {
	System.out.println("Name : "+(firstname+" "+lastname));
	System.out.println("salary : "+salary);
}
}
