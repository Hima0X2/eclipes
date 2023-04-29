package String;

public class Person {
String name;
int age;
public Person(String name,int age) {
	this.age=age;
	this.name=name;
}
	public String toString() {
		return name+" "+age;	
	}
}
