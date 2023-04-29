
package pkg1;

import java.util.Scanner;


public class arithmatic {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1,num2,result;
        System.out.println("enter 2 numbers:");
        num1=input.nextInt();
        num2=input.nextInt();
        result=num1+num2;
        System.out.printf("sum= %d \n",result);
        result=num1-num2;
        System.out.printf("minus= %d \n",result);
        result=num1*num2;
        System.out.printf("multiplication= %d \n",result);
        result=num1/num2;
        System.out.printf("div= %d \n",result);
    }
    
}
