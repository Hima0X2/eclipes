
package decimal.to.hexadecimal;

import java.util.Scanner;

public class DecimalToHexadecimal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int X = input.nextInt();
       String str = Integer.toHexString(X);
        //System.out.println(Integer.toHexString(X));
        System.out.println(str.toUpperCase());
    }
}
