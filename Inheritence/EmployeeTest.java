package Inheritence;

public class EmployeeTest {

	public static void main(String[] args) {
		//Full_Employee e1= new Full_Employee("Sanjida","Samanta", 1200);
   System.out.println("Part Employee");
	Part_Employee p3= new Part_Employee("SANJIDA","SAMANTA", 1200,10);
	p3.h(10);
	p3.show_details();
	p3.cal_increment();
	System.out.println();
	System.out.println();
	}
  
}
