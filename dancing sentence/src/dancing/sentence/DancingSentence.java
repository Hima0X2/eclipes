/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dancing.sentence;

import java.util.Scanner;



/**
 *
 * @author Windows 10
 */
public class DancingSentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float N,Novosalario = 0,Reajusteganho=0,Empercentual=0;
     char c='%';
        Scanner input = new Scanner(System.in);
        N = input.nextFloat();
     if((N>=0)&&(N<=400.00))
     {
          Novosalario=(float) (N+(N*0.15));
          Reajusteganho=(float) (N*0.15);
          Empercentual=15;
     }
     else if((N>=400.01)&&(N<=800.00))
     {
          Novosalario=(float) (N+N*0.12);
          Reajusteganho=(float) (N*0.12);
          Empercentual=12;
     }
      else if((N>=800.01)&&(N<=1200.00))
     {
          Novosalario=(float) (N+N*0.1);
          Reajusteganho=(float) (N*0.1);
          Empercentual=10;
     }
      else if((N>=1200.01)&&(N<=2000.00))
     {
          Novosalario=(float) (N+N*0.07);
          Reajusteganho=(float) (N*0.07);
          Empercentual=7;
     }
      else if(N>=2000.01)
     {
          Novosalario=(float) (N+N*0.04);
          Reajusteganho=(float) (N*0.04);
          Empercentual=4;
     }
        System.out.printf("Novo salario: %.2f\n",Novosalario);
        System.out.printf("Reajuste ganho: %.2f\n",Reajusteganho);
        System.out.printf("Em percentual: %.0f %c\n",Empercentual,c);
    }
    
}
