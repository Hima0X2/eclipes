package Hackerrank;

public class Dog {
private String breed;
private int age;
private String color;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
void barking() {
	System.out.println("Dog is Barking");
}
void hungry() {
	System.out.println("Dog is Hungry.\nGive him "+getBreed());
	
}
void sleeping() {
	System.out.println("Dog is Sleeping");
	System.out.println("Give him "+getColor()+" pillow");
}
public static void main(String[] args){
	Dog dog=new Dog();
	dog.setAge(15);
	dog.setBreed("Mamoni");
	dog.setColor("blue");
	dog.hungry();
	dog.barking();
	dog.sleeping();
}
}

