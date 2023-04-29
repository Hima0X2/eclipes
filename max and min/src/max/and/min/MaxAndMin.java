
package max.and.min;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        int max,min;
        int[] a=new int[6];
        int x;
        System.out.println("Enter elements=");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for (int i = 0; i < x; i++) {
            a[i] = input.nextInt();
        }
           max=a[0];
           min=a[0];
            for (int i = 1; i < x; i++) {
            if(max<a[i])
            {
                max=a[i];
            }  
            if(min>a[i])
            {
                min=a[i];
            }  
        }
            System.out.println("Max= "+max);
            System.out.println("Min= "+min);
        }
    }
    
