
package math;

import java.util.Scanner;


public class mathdemo {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       int x=input.nextInt();
       float y=input.nextFloat();
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.abs(y));
        System.out.println(Math.round(y));
        System.out.println(Math.PI);
    }

    }