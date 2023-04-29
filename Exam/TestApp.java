package Exam;
public class TestApp {
	public static void main(String[] args) {
Staff staff=new Staff();
staff.setName("Samanta");
staff.school="HDC";
staff.setPay(1200);
staff.showstaffinfo();
Students s=new Students();
s.setName("samu");
s.address="chandpur";
s.setProgram("Party");
s.year=2021;
s.fee=1200;
s.showstudentinfo();
	}
}
