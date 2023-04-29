
package even.odd;

import java.util.Scanner;


public class EvenOdd {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        if((x%2)==0)
        {
        System.out.println("The number is even");
        }
        else
        {
             System.out.println("The number is odd");
        }
    }
}
