package UML;

public class TimeTest {

	public static void main(String[] args) {
		Time t=new Time(23, 59, 59);
		System.out.println("Time : "+t.toString());
		System.out.println("Next Time : "+t.nextSecond());
		System.out.println("Previous Time : "+t.prevSecond());
	}

}
