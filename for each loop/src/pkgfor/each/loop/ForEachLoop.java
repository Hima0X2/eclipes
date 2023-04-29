/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.each.loop;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ForEachLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
       int[] a=new int[5];
       Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
             a[i] = input.nextInt();
        }
        for (int x: a) {
            sum=sum+x;
        }
        System.out.println(sum);
       
    }
    
}
