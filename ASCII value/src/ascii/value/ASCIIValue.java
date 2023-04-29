
package ascii.value;

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.printf("%c The ASCII value is ",x);
    }
    
}
