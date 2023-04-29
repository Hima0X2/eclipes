/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigletter;

import java.util.Scanner;

public class Bigletter {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if((a>b)&&(a>c))
        {
          System.out.println(a);
        }
        else if((a<b)&&(b>c))
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
    
}
