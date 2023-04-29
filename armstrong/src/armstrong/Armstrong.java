/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int v,x,sum=0,temp;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        temp=x;
        while(temp!=0)
        {
            v=temp%10;
            sum=sum+v*v*v;
            temp=temp/10;
        }
        if(x==sum)
        {
        System.out.println("The number is armstrong");
    }
        else
        {
         System.out.println("The number isn't armstrong");   
        }
    }
    
}
