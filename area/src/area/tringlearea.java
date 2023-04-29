
package area;

import java.util.Scanner;

public class tringlearea {
    public static void main(String[] args) {
        int a,b;
                double area;
        Scanner input= new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        a=input.nextInt();
        b=input.nextInt();
        area=0.5*a*b;
        System.out.printf("area= %f\n",area);
    }
}
