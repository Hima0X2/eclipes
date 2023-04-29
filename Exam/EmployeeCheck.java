package Exam;

public class EmployeeCheck extends Employee{
	@Override
	public double computerpay() {
		return getNumber()*getNumber();
	}
	public void thanks() {
	System.out.println("hello"+getName()+"Thanks for overwrite the method");
}
}
