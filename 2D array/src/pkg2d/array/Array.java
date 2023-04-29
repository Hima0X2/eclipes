package pkg2d.array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[][] a= new int[10][10];
       int[][] b= new int[10][10];
       int[][] c= new int[10][10];
       int n,i,j;
        System.out.println("Enter the elements=");
        n = input.nextInt();
        System.out.println("enter A matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("a[%d][%d]= ",i,j);
               a[i][j]= input.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
              System.out.printf("b[%d][%d]= ",i,j);
             b[i][j]= input.nextInt(); 
            }
        }
        System.out.println("c=");
         for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
              c[i][j]=a[i][j]+b[i][j]; 
              System.out.print(" \t"+c[i][j]);
            }
             System.out.println("");
         }
    }
    
}
