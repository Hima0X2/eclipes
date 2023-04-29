
package array1;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int[][] a=new int[2][2];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                a[row][col] = input.nextInt();  
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.printf("%d\t",a[row][col]); 
            }
            System.out.println("\n");
        }
    }
}
