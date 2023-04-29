package array1;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
       int a,b,c,d,p,q,x,y,z;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
     x=a*60+b;
     y=c*60+d;
     if(x<y)
     {
          z=y-x;
          if(z>=60)
          {
          p=z/60;
          q=z%60;
              System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",p,q);
          }
          else
          {
               System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n",z);
          }
     }
     else if(x==y)
     {
          System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
     }
     else
     {
          z=24*60+y-x;
           if(z>=60)
          {
          p=z/60;
          q=z%60;
              System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",p,q);
          }
          else
          {
               System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n",z);
          }
     }
}
}
