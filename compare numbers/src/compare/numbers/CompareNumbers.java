
package compare.numbers;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        if(x==y)
        {
            System.out.println(x+" = "+y);
        }
        if(x<=y)
        {
            System.out.println(x+" <= "+y);
        }
        if(x<y)
        {
            System.out.println(x+" < "+y);
        }
        if(x>=y)
        {
            System.out.println(x+" >= "+y);
        }
        if(x>y)
        {
            System.out.println(x+" > "+y);
        }
        if(x!=y)
        {
            System.out.println(x+" != "+y);
        }
    }
    
}
