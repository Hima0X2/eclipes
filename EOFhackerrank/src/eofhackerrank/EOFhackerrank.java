/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eofhackerrank;

import java.util.Scanner;


/**
 *
 * @author Windows 10
 */
public class EOFhackerrank {

             public static void main(String[] args) {
        int math,phy,chem,total;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input the marks obtained in Physics: ");
        phy = input.nextInt(); 
        System.out.printf("Input the marks obtained in Chemistry: ");
        chem = input.nextInt();
        System.out.printf("Input the marks obtained in Mathematics: ");
        math = input.nextInt();
        total=phy+chem+math;
        if((math>=65)&&(phy>=55)&&(chem>=50))
        {
            if(total>=180)
            {
                System.out.println("This candidate is elegible");
            }
            else
            {
                 System.out.println("This candidate isn't elegible");
            }
        }
        else
        {
             System.out.println("This candidate isn't elegible");
        }
    }
    
}
