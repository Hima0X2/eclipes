
package arraylist.pkg1;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {
    public static void main(String[] args) {
         ArrayList<Integer> number = new ArrayList<>();
         number.add(10);
         number.add(20);
         number.add(30);
         number.add(40);
         System.out.println(number.size());
         number.clear();
         System.out.println(number.size());
         number.add(10);
         number.add(20);
         number.add(30);
         number.add(40);
         System.out.println(" "+number);
         System.out.println(number.size());
         boolean b= number.contains(30);
         System.out.println("b = "+b);
         number.set(2,78);
          System.out.println(" "+number);
          Collections.sort(number);
           System.out.println(" "+number);
           Collections.sort(number,Collections.reverseOrder());
            System.out.println(" "+number);
    }
    
}
