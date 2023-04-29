
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class JavaLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int N = input.nextInt();
       
        int k;
        for (int j = 1; j <= 10; j++) {
            k=j*N;
            System.out.printf("%d x %d = %d\n",N,j,k);
        }
    }
    
}
