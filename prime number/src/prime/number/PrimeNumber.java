
package prime.number;

import java.util.Scanner;


public class PrimeNumber {

    
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 2; i < n/2; i++) {
            if((n%i)==0)
            {
                sum=1;
                break;
            }
        }
        if(sum==1)
        {
        System.out.println("The number isn't prime");
        }
        else
        {
            System.out.println("The number is prime");
        }
    }
    
}
