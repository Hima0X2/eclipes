package Encapsulation;

import java_final.math.*;

public class CalculateArea {
private int h,w,r;
public void setH(int h) {
	this.h = h;
}
public void setR(int r) {
	this.r = r;
}
public void setW(int w) {
	this.w = w;
}
public int getH() {
	return h;
}
public int getR() {
	return r;
}
public int getW() {
	return w;
}
double rectangle_area() {
	return h*w;
}
double circle_area() {
	return Math.PI*r*r;
}
}
