package java_final;

public class Date {
int month,year,day;
void date(int month,int day,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}
void displaydate() {
	System.out.println(day+" / "+month+" / "+year);
}
}
