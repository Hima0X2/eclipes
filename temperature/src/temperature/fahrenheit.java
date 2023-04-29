
package temperature;

import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        double f,c;
        Scanner input = new Scanner(System.in);
        c= input.nextDouble();
        f=(9/5)*c+32;
        System.out.println("f= "+f);
    }
    
}
