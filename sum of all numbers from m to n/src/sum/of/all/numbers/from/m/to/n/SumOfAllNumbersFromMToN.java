/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.of.all.numbers.from.m.to.n;

import java.util.Scanner;



public class SumOfAllNumbersFromMToN {

    
    public static void main(String[] args) {
        int m,n,sum=0;
        Scanner input= new Scanner(System.in);
       m=input.nextInt();
       n=input.nextInt();
        for (int j = m; j <=n; j++) {
            sum=sum+j;
        }
        System.out.println(sum);
    }
    
}
