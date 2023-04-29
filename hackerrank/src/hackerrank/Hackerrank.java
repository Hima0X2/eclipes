/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           String[] s1=new String[100];
           int[] x=new int[100];
           int i;
            for(i=0;i<3;i++){
                s1[i]=sc.next();
                 x[i]=sc.nextInt();
            }
             System.out.println("================================");
                for (i= 0; i < 3; i++) {  
                //System.out.printf("%s\t\t%d\n",s1[i],x[i]);
                    System.out.println(s1[i]+"\t\t"+x[i]);
                }
                
                    
            System.out.println("================================");

    }
    
}
