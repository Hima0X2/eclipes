/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Javaloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N,i,k;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for (i = 1; i <= 10; i++) {
            k=i*N;
            System.out.printf("%d x %d = %d\n",N,i,k);
        }
    }
    
}
