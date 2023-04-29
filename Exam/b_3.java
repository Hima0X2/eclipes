package Exam;

public class b_3 {
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
private void barking() {
	System.out.println("Dog is barking for "+getBreed());
}
private void hungry() {
	System.out.println("Dog is hungry gave him "+getBreed());
}
private void sleeping() {
	System.out.println("Dog is sleeping gave him "+getColor()+" pillow");
}
public static void main(String[] args) {
	b_3 b=new b_3();
	b.setAge(10);
	b.setBreed("ruti");
	b.setColor("Blue");
	b.sleeping();
	b.barking();
	b.hungry();
}
}
