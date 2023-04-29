package java_final;

public class DateTest {

	public static void main(String[] args) {
		Date d1= new Date();
		d1.day=22;
		d1.month=9;
		d1.year=2021;
		d1.displaydate();
		Date d2= new Date();
		d2.date(9, 22, 2010);
		d2.displaydate();
	}

}
