/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri9;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Uri9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
     if(a==b)
     {
          System.out.printf("O JOGO DUROU 24 HORA(S)\n");
     }
     else if(b>a)
     {
          System.out.printf("O JOGO DUROU %d HORA(S)\n",b-a);
     }
     else if(a>b)
     {
          System.out.printf("O JOGO DUROU %d HORA(S)\n",(b+24)-a);
     }
    }
    
}
