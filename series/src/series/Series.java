
package series;

import static java.lang.Math.pow;
import java.util.Scanner;


public class Series {

    
    public static void main(String[] args) {
       int n,sum=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum=(int) (sum+pow(i,2));
        }
        System.out.println(sum);
    }
    
}
