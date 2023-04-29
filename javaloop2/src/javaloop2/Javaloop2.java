/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloop2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Javaloop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,a,b,c,i,j,k;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
       for(i=0;i<n;i++)
     {
          a = input.nextInt();
          b = input.nextInt();
          c = input.nextInt();
      int sum=a;
      for(j=1,k=1;k<=c;k++,j=j*2)
      {
           sum=sum+j*b;
           System.out.printf(sum+" ");
      }
         System.out.println("");
     }
    }
    
}
