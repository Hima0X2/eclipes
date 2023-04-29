
package factorial;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         int n,f=1;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
    
}
