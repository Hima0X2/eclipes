
package decimal.to.octal;

import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args) {
       int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        //String str = Integer.toOctString(X);
        //System.out.println(Integer.toHexString(X));
        System.out.printf("%o\n",x);
    }
    
}
