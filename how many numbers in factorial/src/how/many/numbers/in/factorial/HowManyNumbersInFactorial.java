
package how.many.numbers.in.factorial;

import java.util.Scanner;

public class HowManyNumbersInFactorial {

    public static void main(String[] args) {
        int n,f=1,c=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
     for(int i=1;;i++)
     {
          f=f*i;
          if(f<=n)
          {
               c++;
          }
          else
          {
               break;
          }
     }
        System.out.println(c);
    }
}
