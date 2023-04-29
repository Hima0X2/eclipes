package migratory.birds;

import java.util.Scanner;

public class MigratoryBirds {

    public static void main(String[] args) {
        int x,i,ans=0;
        int[] a=new int[100];
        int[] b=new int[100];
        b[100]=0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for ( i = 0; i < x; i++) {
            a[i]=input.nextInt();
            b[a[i]]++;
        }
        int max=b[1];
        for(i=2;i<6;i++)
        {
         if(max<b[i])
         {
             max=b[i];
             ans=i;
         }
        }
        //ans=ans;
        System.out.println(ans);
    }
}