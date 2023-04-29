
package reverse.number;

import java.util.Scanner;


public class ReverseNumber {

    
    public static void main(String[] args) {
         int v,x,sum=0,temp;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        temp=x;
        while(temp!=0)
        {
            v=temp%10;
            sum=sum*10+v;
            temp=temp/10;
        }
        System.out.println(sum);
    }
    
}
