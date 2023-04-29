
package pkg2d.array.pkgtrue.pkgfalse;

import java.util.Scanner;

public class ArrayTrueFalse {
    public static void main(String[] args) {
        int[] a= new int[10];
        int p;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j)
                {
                    System.out.printf("False ");
                }
                else
                {
                    System.out.printf("True ");
                }
            }
            System.out.println(" ");
        }
    } 
}
