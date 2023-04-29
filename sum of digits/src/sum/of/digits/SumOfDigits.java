
package sum.of.digits;

import java.util.Scanner;

public class SumOfDigits {

    
    public static void main(String[] args) {
        int x,i,j,sum=0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        j=x;
        while(j!=0)
        {
           i=j%10;
           sum=sum+i;
           j=j/10;   
        }
        System.out.println(sum);
    }
    
}
