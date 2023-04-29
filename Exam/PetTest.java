package Exam;

public class PetTest {

	public static void main(String[] args) {
		Cat c= new Cat();
		c.setName("Tom");
		System.out.println("Name : "+c.getName());
		c.play();
		c.eat();
		Fish f=new Fish();
		f.setName("Mimo");
		System.out.println("Name : "+f.getName());
		f.play();
	}

}
