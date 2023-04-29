package hacker.rank;

import java.util.Scanner;
public class HackerRank {
    public static void main(String[] args) {
        int n;
       long[] a=new long[100];
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int j = 0; j < n; j++) {
            a[j] = input.nextLong();
            System.out.println(a[j]+" can be fitted in:");
            if((a[j]>-128)&&(a[j]<127))
            {
                System.out.println("* byte");
            }
            if((a[j]>-32768)&&(a[j]<32767))
            {
                System.out.println("* short");
            }
            if((a[j]>-2147483648)&&(a[j]<2147483647))
            {
                System.out.println("* int");
            }
            if(a[j]>= -Math.pow(2, 63) && a[j] <= Math.pow(2, 63) - 1)
            {
                System.out.println("* long");
            }
            else
            {
                System.out.println(a[j]+" can't be fitted anywhere.");
            }
        }
    }
    
}
