
package prime.number;

import java.util.Scanner;
public class primenumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       int num1=0,num2=1,feb;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 3; i <= x; i++) {
            feb=num1+num2;
            System.out.println(feb);
            num1=num2;
            num2=feb;
        }
                
    }
    
}
