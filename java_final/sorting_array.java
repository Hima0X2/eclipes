package java_final;

import java.util.Arrays;
import java.util.Scanner;

public class sorting_array {
public static void main(String[] args) {
	int i,n;
	Scanner a= new Scanner(System.in);
	n=a.nextInt();
	int[] ar=new int[n];
	for(i=0;i<n;i++) {
		ar[i]=a.nextInt();	
	}
	Arrays.sort(ar);
	for(i=0;i<n;i++) {
		System.out.println(ar[i]);
	}
}
}
