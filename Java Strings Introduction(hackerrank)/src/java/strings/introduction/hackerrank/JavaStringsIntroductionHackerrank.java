package java.strings.introduction.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
public class JavaStringsIntroductionHackerrank {
    public static void main(String[] args) {
        String[] a= new String[100];
        String[] b= new String[100];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
             a[i] = input.next();
             b[i] = input.next();
        }
       
        int x= a.length;
        int y= b.length;
        int sum=x+y;
        System.out.println(sum);
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
        
    }
    
}
