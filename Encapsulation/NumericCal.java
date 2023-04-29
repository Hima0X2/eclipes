package Encapsulation;
import java.lang.Math;
public class NumericCal {
private int num1,num2,num3;
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum1() {
	return num1;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
public int getNum2() {
	return num2;
}
public void setNum3(int num3) {
	this.num3 = num3;
}
public int getNum3() {
	return num3;
}
int findMax(int num1,int num2,int num3) {
	int mx;
	mx=Math.max(num2, num3);
	 mx= Math.max(mx,num1);
	return mx;
	
}
int findMin(int num1,int num2,int num3) {
	int mn;
	mn=Math.min(num2, num3);
	 mn= Math.min(mn,num1);
	return mn;
	
}
int findAvr() {
	int sum=num1+num2+num3;
	return (sum/3);
}
}
