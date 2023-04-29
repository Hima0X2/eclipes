
package pkgtrue.or.pkgfalse;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        double a,b;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        if(((a==0)||(a==1))&&((b==0)||(b==1)))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
