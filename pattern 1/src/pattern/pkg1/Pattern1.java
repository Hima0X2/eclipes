
package pattern.pkg1;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
       int row,col,n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (row = 1;row<=n;row++) {
           for (col= 1;col<=row;col++){
               System.out.printf("%d ",col);
           }
            System.out.println("");
        }
    }
    
}
