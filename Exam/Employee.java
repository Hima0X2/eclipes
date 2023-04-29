package Exam;

public abstract class Employee {
private String name="X";
private String address="Y";
private int number=123;
public abstract double computerpay();
private void thanks() {
System.out.println("Thanks");	
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
