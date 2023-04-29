/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.nn.nnn;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class NNnNnn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int sum1=0,sum2=0,z;
        Scanner input = new Scanner(System.in);
        z = input.nextInt();
     for(int i=0;i<3;i++)
     {
          sum1=(int) (sum1+z*pow(10,i));
          sum2=sum1+sum2;
     }
        System.out.println(sum2);
    }
}
