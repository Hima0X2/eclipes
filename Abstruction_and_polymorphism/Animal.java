package Abstruction_and_polymorphism;

public abstract class Animal {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
abstract void eat();
}
