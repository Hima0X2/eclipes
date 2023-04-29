package Exam;

public class Cat implements Pet{
String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void play() {
		System.out.println(getName()+" can play");
	}
	void eat() {
		System.out.println(getName()+" can eat");
	}

}
