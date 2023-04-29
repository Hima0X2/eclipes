
package conditional.operator;

import java.util.Scanner;


public class ConditionalOperator {
    public static void main(String[] args) {
       int a,b,large;
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        large = (a>b)?a:b;
        System.out.println("large = "+large);
    }
    
}
