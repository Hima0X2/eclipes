package Hackerrank;

import java.util.Scanner;

public class Tower_of_hanoi {
static void tower(int n,char a,char b,char c) {
	if(n>0) {
		tower(n-1, b, a, c);	
		System.out.printf("move a disk from %c to %c\n",a,c);
		tower(n-1, a,c,b);	
	}
}
public static void main(String[] args) {
	int n;
	Scanner input= new Scanner(System.in);
	n=input.nextInt();
	tower(n,'a','b','c');
}
}
