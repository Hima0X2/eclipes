package Abstruction_and_polymorphism;

public class Shark extends Swimmer{
	void eat() {
		System.out.println(getName()+" can eat");
	}
	void swim(String name) {
		System.out.println(name+" can swim");
	}
}
