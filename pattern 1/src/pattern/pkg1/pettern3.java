
package pattern.pkg1;

import java.util.Scanner;

public class pettern3 {
    public static void main(String[] args) {
        int row,col,n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (row = n;row >=1;row--) {
            for (col= 1;col<=row;col++) {
                System.out.printf("%d ",col);
            }
            System.out.println();
        }
    }
}
