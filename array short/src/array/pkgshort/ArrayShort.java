package array.pkgshort;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShort {
    public static void main(String[] args) {
       int[] a= new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
             a[i] = input.nextInt();
        }
       Arrays.sort(a);
        for (int i = 4; i>=0; i--){
            System.out.println("a[i]= "+a[i]);}
        }
    }
