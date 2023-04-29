
package days.and.years;

import java.util.Scanner;

public class DaysAndYears {

    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y=(int) ((int)x/365.00);
        z=x-y;
        System.out.println(y);
        System.out.println(z);
    }
    
}
