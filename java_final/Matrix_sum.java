package java_final;

import java.util.Scanner;

public class Matrix_sum {

	public static void main(String[] args) {		
 Scanner a= new Scanner(System.in);
 int[][] matrix1= new int[10][10];
 int[][] matrix2= new int[10][10];
 int[][] sum= new int[10][10];
 int i,j,n;
 System.out.println("Enter n : ");
 n= a.nextInt();
 for(i=0;i<n;i++) {
	 for(j=0;j<n;j++) {
		 matrix1[i][j]=a.nextInt();
	 }
 }
 for(i=0;i<n;i++) {
	 for(j=0;j<n;j++) {
		 matrix2[i][j]=a.nextInt();
	 }
 }
 for(i=0;i<n;i++) {
	 for(j=0;j<n;j++) {
		 sum[i][j]=matrix1[i][j]+matrix2[i][j];
	 }
 }
 for(i=0;i<n;i++) {
	 for(j=0;j<n;j++) {
		 System.out.printf("%d ",sum[i][j]);
	 }
	 System.out.println();
 }
	}

}
