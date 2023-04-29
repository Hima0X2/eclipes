/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;
public class circle {
     public static void main(String[] args) {
        double area,a,pi=3.1416;
        Scanner input= new Scanner(System.in);
        System.out.println("enter a:");
        a=input.nextDouble();
        area=pi*a*a;
        System.out.printf("area= %f\n",area);
    }
}
