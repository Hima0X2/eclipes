
package binary;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
         float x[]=new float[100];
     int i,j=0;
     for(i=0;i<6;i++)
     {
         Scanner input = new Scanner(System.in);
         x[i] = input.nextInt();
     }
     for(i=0;i<6;i++)
     {
          if(x[i]>0)
          {
               j++;
          }
     }
        System.out.printf("%d valores positivos\n",j);
    }
    
}
