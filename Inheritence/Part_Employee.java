package Inheritence;

public class Part_Employee extends Full_Employee{
public Part_Employee(String FirstName, String lastName, double salary,int year) {
	//Full employee er constructor eikhane anse
		super(FirstName, lastName, salary, year);
	}
int hour;
int h(int hour) {
	this.hour=hour;
	return hour;
}
void show_details() {
	System.out.println("Name : "+(FirstName+" "+lastName));
	System.out.println("Year : "+year);
	System.out.println("Working Hour : "+hour);
	System.out.println("Salary : "+salary);
}
void cal_increment(){
    if(hour<5 && year<2){
        salary =salary+ (salary*0.02);
    }
    else if(hour == 5 && year<2){
        salary =salary+ (salary*0.03);
    }
         else  if(hour==5 && year>2){
        salary = salary+ (salary*0.05);
    }
    System.out.println("incremented salary : "+ salary);
    
}
}
