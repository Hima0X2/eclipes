
package multiplication.table;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
         int n,f;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <=10; i++) {
            f=n*i;
            System.out.println(n+" X "+i+" = "+f);
        }
    }
    
}
