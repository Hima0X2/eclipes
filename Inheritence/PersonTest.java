package Inheritence;

public class PersonTest {
	public static void main(String[] args) {
		Students s1=new Students("samanta", "Chandpur");
		s1.setFee(1000);
		s1.setProgram("adda");
		s1.setYear(2010);
		s1.showStudentInfo();
		Staff s2= new Staff("Rahim", "Chandpur");
		s2.setPay(1200);
		s2.setSchool("Hajigonj Degree Collage");
		s2.showStaffInfo();
	}
}
